package com.training.domains;

public class Student implements Comparable<Student>{
	private long id;
	private String name;
	private double mark;
	private String department;
	
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @param id
	 * @param name
	 * @param mark
	 * @param department
	 */
	public Student(long id, String name, double mark, String department) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.department = department;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the mark
	 */
	public double getMark() {
		return mark;
	}



	/**
	 * @param mark the mark to set
	 */
	public void setMark(double mark) {
		this.mark = mark;
	}



	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}



	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public int compareTo(Student o) {
		if(mark > o.mark){
			return 1;
		}if(mark < o.mark){
			return -1;
		}else{
			return 0;
		}
	}
}
