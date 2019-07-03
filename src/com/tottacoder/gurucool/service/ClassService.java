package com.tottacoder.gurucool.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tottacoder.gurucool.model.Class;
import com.tottacoder.gurucool.model.Student;

public class ClassService {
	private Map<Integer,Class> classMap ;
	
	public ClassService()
	{
		classMap = new HashMap();
		initializeMap();
	}
	private void initializeMap()
	{
		Student s1 = new Student();
		s1.setName("Abhishek Choudhary");
		s1.setRollNo(1);
		s1.setId(001);
		

		Student s2 = new Student();
		s2.setName("Pradeep Poonia");
		s2.setRollNo(2);
		s2.setId(002);
		List<Student> student = new ArrayList();
		student.add(s1);
		student.add(s2);
		
		Class c1 = new Class();
		c1.setClassName("Nursery");
		c1.setClassTeacher("Manjulika");
		c1.setId(0);
		c1.setStudents(student);
		
		classMap.put(c1.getId(), c1);
	}
	public Class getClassDetails(int id)
	{
		return classMap.get(id);
		
		
	}

}
