package com.training.domains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TopRankers {
	HashMap<String, ArrayList<Student>> studentsDB;
	public TopRankers() {
		this.studentsDB = new HashMap<String, ArrayList<Student>>();	
	}
	
	public void init(){
		addStudent(new Student(1, "Sonny", 90, "CS"));
		addStudent(new Student(1, "Bob", 50, "CS"));
		addStudent(new Student(1, "Frank", 60, "CS"));
		addStudent(new Student(1, "Chester", 70, "CS"));
		
		
	}
	
	//this add assumes that there are no duplicate students
	public void addStudent( Student s){
		String dept = s.getDepartment();
		if(!studentsDB.containsKey(dept)){
			ArrayList<Student> students = new ArrayList<Student>();
			students.add(s);
			studentsDB.put(dept, students);
		}else{		
			studentsDB.get(dept).add(s);			
		}	
	}
	public ArrayList<Student> findTopRanker(String dept){
		ArrayList<Student> output = new ArrayList<Student>();
		ArrayList<Student> students = studentsDB.get(dept);
		for(Student s : students){
			if(s.getMark() > 10){
				output.add(s);
			}
		}
		Collections.sort(output);
		Collections.reverse(output);
		return output;
		
		
	}
	
}
