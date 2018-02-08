package edu.iit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
 * Servlet implementation class AppraisalServlet
 */
public class AppraisalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AppraisalServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int eId;
		boolean flag = false;
		EmployeeDAO emethod = new EmployeeDAO();

		eId = Integer.parseInt(request.getParameter("emp_id"));
		Employee emp = new Employee();

		Employee employee = emethod.empcheck(eId);

		PrintWriter out = response.getWriter();
		out.println(emp.getMgrID());

		if (employee != null) {
			if (employee.getMgrID() != 0) {
				flag = emethod.empAppraise(eId);

			} else {
				out.println(emp.getMgrID());
				flag = emethod.mgrAppraise(eId);

			}
		} else {
			System.out.println("Employee not found");
		}
		if (flag) {
			RequestDispatcher rd = request.getRequestDispatcher("DisplayNew.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
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
