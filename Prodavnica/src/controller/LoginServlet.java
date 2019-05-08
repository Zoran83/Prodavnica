package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;
import model.User;
import service.LoginMetode;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "servlet za login", urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		LoginMetode login = new LoginMetode();
		Admin admin = new Admin();
		if (login.daLiPostojiUser(userName)) {
			//nastavi ispitivanje passworda
			if(login.daLiJeDobarPass(userName, password)) {
				User user = login.vratiUsera(userName, password);
				
				HttpSession sesija = request.getSession();
				sesija.setAttribute("Valter", user);
				
				//sve ok
				if(userName.equals(admin.getAdminUserName()) && password.equals(admin.getAdminPassword())) {
					//idi na admin
					response.sendRedirect("jsp/admin.html");
				}else {
					// idi na user nalog
					response.sendRedirect("jsp/user.html");
				}
			}else {
				response.sendRedirect("index.html");
			}
		} else {
			response.sendRedirect("index.html");
		}
	}

}
