/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author Abhishek
 *
 */
public class Student {
	
	private int student_id;
	private String student_name;
	private String student_email;
	private String student_pwd;
	private String addr;
	
	
	/**
	 * @param student_id
	 * @param student_name
	 * @param student_email
	 * @param student_pwd
	 * @param addr
	 */
	public Student(int student_id, String student_name, String student_email, String student_pwd, String addr) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_pwd = student_pwd;
		this.addr = addr;
	}

	
	
	
	

}
