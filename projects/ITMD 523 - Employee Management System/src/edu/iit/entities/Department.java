
package edu.iit.entities;

/**
 * 
 * @author Jaswanth Busnur Jagadeesh
 * @author Phanindra Chandraprakash
 * @author Rahul Madhusudhan Gudihal
 * @version 1.0
 * @since 12/06/2016
 *
 */
public class Department {
	/**
	 * Department Entity with deptId,deptName,deptLocn fields. deptId is the
	 * primary key which is referenced in the Employee table
	 */
	private int deptId;
	private String deptName;
	private String deptLocn;

	public Department() {
	}

	public Department(int deptId, String deptName, String deptLocn) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocn = deptLocn;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocn() {
		return deptLocn;
	}

	public void setDeptLocn(String deptLocn) {
		this.deptLocn = deptLocn;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptLocn=" + deptLocn + "]";
	}

}
