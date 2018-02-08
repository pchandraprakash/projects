package edu.iit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iit.dao.EmployeeDAO;

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
 * Servlet implementation class DelServlet
 */
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DelServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		EmployeeDAO emethod = new EmployeeDAO();
		int eid = Integer.parseInt(request.getParameter("emp_id"));
		PrintWriter out = response.getWriter();

		boolean result = false;

		result = emethod.delete(eid);
		System.out.println(result);
		if (result) {
			out.println("Record deleted Successfully");
		} else {
			out.println("Record not found");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDAO emethod = new EmployeeDAO();
		int deptId = Integer.parseInt(request.getParameter("d_id"));
		PrintWriter out = response.getWriter();

		boolean result = false;

		result = emethod.deleteDepartment(deptId);
		System.out.println(result);
		if (result) {
			out.println("Department deleted Successfully");
		} else {
			out.println("Department not found");
		}
	}

}
