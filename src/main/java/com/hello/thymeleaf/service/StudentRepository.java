package com.hello.thymeleaf.service;

import java.util.ArrayList;

import com.hello.thymeleaf.domain.Student;

public interface StudentRepository {

	
	public static ArrayList<Student> findAll(){
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student st = new Student();
		st.setFirstName("Aku");
		st.setLastName("Ankka");
		st.setEmail("aku@ankkalinna.fi");
		list.add(st);
		
		Student st2 = new Student();
		st2.setFirstName("Hannu");
		st2.setLastName("Hanhi");
		st2.setEmail("hannu@ankkalinna.fi");
		list.add(st2);
		
		Student st3 = new Student();
		st3.setFirstName("Teppo");
		st3.setLastName("Tulppu");
		st3.setEmail("teppo@ankkalinna.fi");
		list.add(st3);
		
		
		
		
		return list;
	}
	
}
