package edu.iit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iit.dao.EmployeeDAO;
import edu.iit.entities.Employee;
import edu.iit.entities.LoginTable;

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
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public InsertServlet() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDAO emethod = new EmployeeDAO();
		Employee emp1;

		String fName, lName, uname;
		double sal;
		int eid, mid, grade, depId;
		Date doj = null;
		fName = request.getParameter("e_fname");
		lName = request.getParameter("e_lname");
		eid = Integer.parseInt(request.getParameter("emp_id"));
		mid = Integer.parseInt(request.getParameter("mgr_id"));
		sal = Double.parseDouble(request.getParameter("sal"));
		doj = Date.valueOf(request.getParameter("doj"));
		grade = Integer.parseInt(request.getParameter("grade"));
		depId = Integer.parseInt(request.getParameter("d_id"));
		uname = request.getParameter("username");

		emp1 = new Employee(eid, fName, lName, doj, sal, mid, grade, depId, uname);
		LoginTable log = new LoginTable(fName, lName);

		PrintWriter out = response.getWriter();

		boolean result = emethod.insertEmployee(emp1);

		boolean result1 = emethod.insertEmployeeLog(log);

		if (result) {
			out.println("Employee details successfully stored");
			if (result1) {
				out.println("Employee log stored !!");
			} else {
				out.println("Employee log not stored ..");
			}

		} else {

			out.println("Failure in Employee details storage  !!");
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
