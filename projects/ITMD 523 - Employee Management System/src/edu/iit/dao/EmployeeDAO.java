package edu.iit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.iit.entities.ConnectionFactory;
import edu.iit.entities.Department;
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
public class EmployeeDAO {
	/**
	 * This class is used to perform Database operations like select, insert and
	 * update
	 */
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;

	/**
	 * Method to insert employee details
	 * 
	 * @param employee
	 *            Employee object
	 * @return returns a boolean value: true or false
	 */
	public boolean insertEmployee(Employee employee) {
		Connection con = ConnectionFactory.getCon();
		try {
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?)");

			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setInt(3, employee.getEmpId());
			ps.setInt(4, employee.getMgrID());
			ps.setDate(5, employee.getJoinDate());
			ps.setDouble(6, employee.getSalary());
			ps.setInt(7, employee.getDeptId());
			ps.setInt(8, employee.getEmpGrade());
			ps.setNString(9, employee.getUsername());

			ps.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Method to insert employee details to login table. Firstname of the
	 * employee will be the username and lastname will be the password to login
	 * to the application by an employee
	 * 
	 * @param l
	 *            logintable object
	 * @return returns a boolean value: true or false
	 */
	public boolean insertEmployeeLog(LoginTable l) {
		Connection con = ConnectionFactory.getCon();
		try {
			PreparedStatement ps = con.prepareStatement("insert into login_tbl values(?,?,'employee')");

			ps.setString(1, l.getUsername());
			ps.setString(2, l.getPassword());

			ps.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * insertDept method is used to insert department details to the database
	 * 
	 * @param d
	 *            department object
	 * @return returns a boolean value: true or false
	 */
	public boolean insertDept(Department d) {
		Connection con = ConnectionFactory.getCon();
		try {
			PreparedStatement ps = con.prepareStatement("insert into department values(?,?,?)");

			ps.setInt(1, d.getDeptId());
			ps.setString(2, d.getDeptName());
			ps.setString(3, d.getDeptLocn());
			ps.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * update method is used to update the employee details
	 * 
	 * @param employee
	 *            employee object
	 * @return returns a boolean value: true or false
	 */
	public boolean update(Employee employee) {
		Connection con = ConnectionFactory.getCon();
		try {
			PreparedStatement ps = con
					.prepareStatement("update employee set sal=?,mgr_id=?,grade=?,d_id=? where emp_id=?");

			ps.setDouble(1, employee.getSalary());
			ps.setInt(2, employee.getMgrID());
			ps.setInt(3, employee.getEmpGrade());
			ps.setInt(4, employee.getDeptId());
			ps.setInt(5, employee.getEmpId());

			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * updateDept method is used to update the Department details
	 * 
	 * @param d
	 *            department object
	 * @return returns a boolean value: true or false
	 */
	public boolean updateDept(Department d) {
		Connection con = ConnectionFactory.getCon();
		try {
			PreparedStatement ps = con.prepareStatement("update department set d_name=?,d_location=? where d_id=?");

			ps.setString(1, d.getDeptName());

			ps.setString(2, d.getDeptLocn());
			ps.setInt(3, d.getDeptId());

			ps.executeUpdate();
			System.out.println(d);
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * delete method is used to delete an employee based on employee ID as input
	 * 
	 * @param emp_id
	 *            Employee ID
	 * @return returns a boolean value: true or false
	 */

	public boolean delete(int emp_id) {
		Connection con = ConnectionFactory.getCon();

		String query = "delete from employee where emp_id=" + emp_id;

		PreparedStatement ps;

		try {
			String query1 = "select count(*) from employee";
			st = con.createStatement();
			rs = st.executeQuery(query1);
			rs.first();

			int result = rs.getInt(1);
			st.close();

			st = con.createStatement();
			int res = st.executeUpdate(query);

			query1 = "select count(*) from employee";
			st = con.createStatement();
			rs = st.executeQuery(query1);
			rs.first();

			int result1 = rs.getInt(1);
			st.close();

			if (result == result1) {
				return false;
			} else {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * method is used to delete a department based on department ID as input
	 * 
	 * @param deptId
	 *            Department ID
	 * @return returns a boolean value: true or false
	 */
	public boolean deleteDepartment(int deptId) {
		Connection con = ConnectionFactory.getCon();

		String query = "delete from department where d_id=" + deptId;

		PreparedStatement ps;

		try {
			String query1 = "select count(*) from department";
			st = con.createStatement();
			rs = st.executeQuery(query1);
			rs.first();

			int result = rs.getInt(1);
			st.close();

			st = con.createStatement();
			int res = st.executeUpdate(query);

			query1 = "select count(*) from department";
			st = con.createStatement();
			rs = st.executeQuery(query1);
			rs.first();

			int result1 = rs.getInt(1);
			st.close();

			if (result == result1) {
				return false;
			} else {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * getEmployee method is used to get the type of employee logging in, it
	 * will be either admin or employee
	 * 
	 * @param username
	 *            Name of the user logging in
	 * @param password
	 *            Password for the user
	 * @return returns type of employee as string, else returns invalid string
	 */
	public String getEmployee(String username, String password) {
		Connection con = ConnectionFactory.getCon();

		try {
			st = con.createStatement();
			String query = "select * from login_tbl where username='" + username + "'and password='" + password + "'";
			System.out.println(query);
			rs = st.executeQuery(query);
			if (rs != null) {
				rs.first();
				String string = rs.getString(3);
				System.out.println("EmployeeDAO::getEmployee:type-" + string);
				return string;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "invalid";
	}

	/**
	 * empcheck method to validate if employee exists and perform Database
	 * operations
	 * 
	 * @param emp_id
	 *            Employee ID
	 * @return returns employee object
	 */
	public Employee empcheck(int emp_id) {
		Connection con = ConnectionFactory.getCon();
		Employee employee = null;
		String q1 = "select * from employee where emp_id=" + emp_id;
		try {
			st = con.createStatement();
			rs = st.executeQuery(q1);
			employee = new Employee();
			if (rs.next()) {
				employee.setEmpId(rs.getInt(3));
				employee.setFirstName(rs.getString(1));
				employee.setMgrID(rs.getInt(4));
				employee.setJoinDate(rs.getDate(5));
				employee.setSalary(rs.getDouble(6));
				employee.setDeptId(rs.getInt(7));
				employee.setEmpGrade(rs.getInt(8));
				employee.setLastName(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return employee;
	}

	/**
	 * empAppraise method is used to appraise the employee based on grading
	 * given
	 * 
	 * @param emp_id
	 *            Employee ID
	 * @return returns a boolean value: true or false
	 */
	public boolean empAppraise(int emp_id) {
		Connection con = ConnectionFactory.getCon();
		String q1 = "update employee set sal=(sal+grade*sal*0.10) where emp_id=" + emp_id;
		try {

			st = con.createStatement();
			st.executeUpdate(q1);
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	/**
	 * mgrAppraise method is used to appraise the employee
	 * 
	 * @param emp_id
	 *            Employee ID
	 * @return returns a boolean value: true or false
	 */
	public boolean mgrAppraise(int emp_id) {
		Connection con = ConnectionFactory.getCon();
		try {
			String q2 = "update employee set sal=(sal+grade*sal*0.05) where emp_id=" + emp_id;
			st = con.createStatement();
			st.executeUpdate(q2);
			return true;
		}

		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	/**
	 * getLoginDetails to retrieve the first name of the user logging in
	 * 
	 * @param name
	 *            employee first name
	 * @return returns employee object
	 */
	public Employee getLoginDetails(String name) {
		Connection con = ConnectionFactory.getCon();
		Employee employee = null;
		try {
			String q2 = "select * from employee where e_fname='" + name + "'";
			st = con.createStatement();
			rs = st.executeQuery(q2);
			if (rs.next()) {
				employee = new Employee();
				employee.setEmpId(rs.getInt(3));
				employee.setFirstName(rs.getString(1));
				employee.setMgrID(rs.getInt(4));
				employee.setJoinDate(rs.getDate(5));
				employee.setSalary(rs.getDouble(6));
				employee.setDeptId(rs.getInt(7));
				employee.setEmpGrade(rs.getInt(8));
				employee.setLastName(rs.getString(2));
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
}
