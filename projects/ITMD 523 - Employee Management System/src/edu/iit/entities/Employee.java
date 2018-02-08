package edu.iit.entities;

import java.sql.Date;

/**
 * 
 * @author Jaswanth Busnur Jagadeesh
 * @author Phanindra Chandraprakash
 * @author Rahul Madhusudhan Gudihal
 * @version 1.0
 * @since 12/06/2016
 *
 */
public class Employee {
	/**
	 * Employee Entity with empId, firstName, lastName, joinDate, salary, mgrID,
	 * empGrade, deptId, username fields. empId is the primary key, deptId is
	 * the foreign key for the Employee table
	 */
	private int empId;
	private String firstName;
	private String lastName;
	private Date joinDate;
	private double salary;
	private int mgrID;
	private int empGrade;
	private int deptId;
	private String username;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public Employee(int empId, String firstName, String lastName, Date joinDate, double salary, int mgrID, int empGrade,
			int deptId, String deptName, String deptLocn) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinDate = joinDate;
		this.salary = salary;
		this.mgrID = mgrID;
		this.empGrade = empGrade;
		this.deptId = deptId;

	}

	public Employee(int empId, double salary, int mgrID, int empGrade, int deptId) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.mgrID = mgrID;
		this.empGrade = empGrade;
		this.deptId = deptId;
	}

	public Employee(int empId, String firstName, String lastName, Date joinDate, int salary, int mgrID, int empGrade) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinDate = joinDate;
		this.salary = salary;
		this.mgrID = mgrID;
		this.empGrade = empGrade;
	}

	public Employee(int empId, String firstName, String lastName, Date joinDate, double salary, int mgrID, int empGrade,
			int deptId, String username) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinDate = joinDate;
		this.salary = salary;
		this.mgrID = mgrID;
		this.empGrade = empGrade;
		this.deptId = deptId;
		this.username = username;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getMgrID() {
		return mgrID;
	}

	public void setMgrID(int mgrID) {
		this.mgrID = mgrID;
	}

	public int getEmpGrade() {
		return empGrade;
	}

	public void setEmpGrade(int empGrade) {
		this.empGrade = empGrade;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptId;
		result = prime * result + empGrade;
		result = prime * result + empId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((joinDate == null) ? 0 : joinDate.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + mgrID;
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (deptId != other.deptId)
			return false;
		if (empGrade != other.empGrade)
			return false;
		if (empId != other.empId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (joinDate == null) {
			if (other.joinDate != null)
				return false;
		} else if (!joinDate.equals(other.joinDate))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mgrID != other.mgrID)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", joinDate="
				+ joinDate + ", salary=" + salary + ", mgrID=" + mgrID + ", empGrade=" + empGrade + ", deptId=" + deptId
				+ "]";
	}

}
