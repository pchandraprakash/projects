package edu.iit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iit.dao.EmployeeDAO;
import edu.iit.entities.Department;

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
 * Servlet implementation class DepartmentServlet
 */
public class DepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DepartmentServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDAO emethod = new EmployeeDAO();
		int depId;
		String depName, depLoc;

		depId = Integer.parseInt(request.getParameter("d_id"));
		depName = request.getParameter("d_name");
		depLoc = request.getParameter("d_location");

		Department d = new Department(depId, depName, depLoc);
		PrintWriter out = response.getWriter();
		boolean result1 = emethod.insertDept(d);

		if (result1) {
			out.println("Department details successfully stored");
		} else {

			out.println("Failure in dept details storage !!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String depLoc, depName;
		int depId;

		depId = Integer.parseInt(request.getParameter("d_id"));
		depName = request.getParameter("d_name");
		depLoc = request.getParameter("d_location");

		EmployeeDAO emethod = new EmployeeDAO();

		Department d = new Department(depId, depName, depLoc);
		boolean result1 = emethod.updateDept(d);
		PrintWriter out = response.getWriter();

		if (result1 == true) {

			out.println("Department update success !!!");

		} else {
			out.println("FAILED TO UPDATE department dets");
		}
	}

}
