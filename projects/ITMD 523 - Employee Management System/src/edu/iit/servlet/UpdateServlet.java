package edu.iit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iit.dao.EmployeeDAO;
import edu.iit.entities.Department;
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
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int eid, mid, grade, depId;
		double sal;

		eid = Integer.parseInt(request.getParameter("emp_id"));
		mid = Integer.parseInt(request.getParameter("mgr_id"));
		sal = Double.parseDouble(request.getParameter("sal"));
		grade = Integer.parseInt(request.getParameter("grade"));
		depId = Integer.parseInt(request.getParameter("d_id"));

		PrintWriter out = response.getWriter();
		Employee emp1 = new Employee(eid, sal, mid, grade, depId);

		EmployeeDAO emethod = new EmployeeDAO();
		boolean flag = emethod.update(emp1);

		if (flag) {
			out.println("Successfully updated !!");
		} else {
			out.println(" NOT Successfully updated Employee !!");
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

		depName = request.getParameter("d_name");
		depId = Integer.parseInt(request.getParameter("d_id"));
		depLoc = request.getParameter("d_location");

		EmployeeDAO emethod = new EmployeeDAO();

		Department d = new Department(depId, depName, depLoc);
		boolean result1 = emethod.updateDept(d);
		PrintWriter out = response.getWriter();

		if (result1) {

			out.println("Department update success !!!");
		} else {
			out.println("FAILED TO UPDATE DEPARTMENT DETAILS");
		}
	}
}
