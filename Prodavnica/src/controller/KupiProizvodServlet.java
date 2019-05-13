package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KupiProizvodServlet
 */
@WebServlet(description = "za kupovinu servlet", urlPatterns = { "/KupiProizvodServlet" })
public class KupiProizvodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] check = request.getParameterValues("check");
		String[] selekti = request.getParameterValues("selekti");
		
		for(int  i = 0; i < check.length; i++) {
			System.out.println("Cek:" + check[i]);
		}
		
		for(int  i = 0; i < selekti.length; i++) {
			System.out.println("Selekt:" + selekti[i]);
		}
	}

}
