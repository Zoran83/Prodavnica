package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dodajProizvodServlet
 */
@WebServlet(description = "dodavanje proizvoda", urlPatterns = { "/dodajProizvodServlet" })
public class dodajProizvodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productName = request.getParameter("productName");
		String productPrice = request.getParameter("productPrice");
		String productStock = request.getParameter("productStock");
		String productDiscount = request.getParameter("productDiscount");
	}

}
