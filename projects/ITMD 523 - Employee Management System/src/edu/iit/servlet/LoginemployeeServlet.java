package edu.iit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.iit.dao.EmployeeDAO;
import edu.iit.entities.Employee;

/**
 * 
 * @author Jaswanth Busnur Jagadeesh
 * @author Phanindra Chandraprakash
 * @author Rahul Madhusudhan Gudihal
 * @version 1.0
 * @since 12/06/2016
 *
 */

/**
 * Servlet implementation class LoginemployeeServlet
 */
public class LoginemployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginemployeeServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("userid");
		String pass = request.getParameter("pswrd");

		System.out.println(name + "" + pass);

		EmployeeDAO employeeDAO = new EmployeeDAO();
		String type = employeeDAO.getEmployee(name, pass);

		Employee employee = employeeDAO.getLoginDetails(name);

		HttpSession session = request.getSession();
		session.setAttribute("employee", employee);

		if (type.equals("admin")) {
			RequestDispatcher rd = request.getRequestDispatcher("AdminPage.html");
			rd.forward(request, response);
		} else if (type.equals("employee")) {
			RequestDispatcher rd = request.getRequestDispatcher("EmployeeLogin.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
