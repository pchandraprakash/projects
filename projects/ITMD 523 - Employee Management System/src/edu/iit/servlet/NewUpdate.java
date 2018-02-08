package edu.iit.servlet;

/**
 * 
 * @author Jaswanth Busnur Jagadeesh
 * @author Phanindra Chandraprakash
 * @author Rahul Madhusudhan Gudihal
 * @version 1.0
 * @since 12/06/2016
 *
 */
public class NewUpdate {

	public boolean deleteEmpNotNull(int id) {
		if (id == 0) {
			System.out.println("Please Enter An ID to Delete !!");
			return false;
		} else
			return true;
	}

	public boolean deleteEmpNotNull(int id, String name) {
		if ((id == 0) || (name == "")) {
			System.out.println("Please Enter An ID,Name to Insert !!");
			return false;
		} else
			return true;
	}
}
