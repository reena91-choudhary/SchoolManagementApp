package com.tottacoder.gurucool.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tottacoder.gurucool.model.Class;
import com.tottacoder.gurucool.model.Student;

public class ClassService {
	private Map<Integer,Class> classMap ;
	private Map<Integer, Integer>classStudentMap;
	private Map<Integer,Student> studentMap;
	
	public ClassService()
	{
		classMap = new HashMap();
		classStudentMap = new HashMap();
		studentMap = new HashMap();
		initializeMap();
	}
	private void initializeMap()
	{
		Student s1 = new Student();
		s1.setName("Abhishek Choudhary");
		s1.setRollNo(1);
		s1.setId(11);
		
		studentMap.put(11, s1);
		
		classStudentMap.put(11, 1);

		Student s2 = new Student();
		s2.setName("Pradeep Poonia");
		s2.setRollNo(2);
		s2.setId(12);
		classStudentMap.put(12, 1);
		studentMap.put(12, s2);
		
		Student s3 = new Student();
		s3.setName("Mohit Choudhary");
		s3.setRollNo(3);
		s3.setId(13);
		classStudentMap.put(13, 1);
		studentMap.put(13, s3);
		
		Student s4 = new Student();
		s4.setName("Soma Poonia");
		s4.setRollNo(4);
		s4.setId(14);
		classStudentMap.put(14, 1);
		studentMap.put(14, s4);
		
		Student s5 = new Student();
		s5.setName("Rohit Choudhary");
		s5.setRollNo(1);
		s5.setId(21);
		classStudentMap.put(21, 2);
		studentMap.put(21, s5);
		
		Student s6 = new Student();
		s6.setName("Sandeep Poonia");
		s6.setRollNo(2);
		s6.setId(22);
		classStudentMap.put(22, 2);
		studentMap.put(22, s6);
		
		Student s7 = new Student();
		s7.setName("Reena Choudhary");
		s7.setRollNo(3);
		s7.setId(23);
		classStudentMap.put(23, 2);
		studentMap.put(23, s7);

		Student s8 = new Student();
		s8.setName("Dhillu Poonia");
		s8.setRollNo(4);
		s8.setId(24);
		classStudentMap.put(24, 2);
		studentMap.put(24, s8);
		
		Student s9 = new Student();
		s9.setName("Vasant Govind Patil");
		s9.setRollNo(1);
		s9.setId(31);
		classStudentMap.put(31, 3);
		studentMap.put(31, s9);
		
		Student s10 = new Student();
		s10.setName("Debjyoti Roy");
		s10.setRollNo(2);
		s10.setId(32);
		classStudentMap.put(32, 3);
		studentMap.put(32, s10);
		
		Student s11 = new Student();
		s11.setName("Micky Mrinal Minz");
		s11.setRollNo(3);
		s11.setId(33);
		classStudentMap.put(33, 3);
		studentMap.put(33, s11);
		
		Student s12 = new Student();
		s12.setName("Mani Kumar Nallani");
		s12.setRollNo(4);
		s12.setId(34);
		classStudentMap.put(34, 3);
		studentMap.put(34, s12);
		
		Student s13 = new Student();
		s13.setName("Sameer Hembrom");
		s13.setRollNo(5);
		s13.setId(35);
		classStudentMap.put(35, 3);
		studentMap.put(35, s13);
		
		Student s14 = new Student();
		s14.setName("S Sweta Yamini");
		s14.setRollNo(6);
		s14.setId(36);
		classStudentMap.put(36, 3);
		studentMap.put(36, s14);
		
		List<Student> student1 = new ArrayList();
		student1.add(s1);
		student1.add(s2);
		student1.add(s3);
		student1.add(s4);
		
		List<Student> student2 = new ArrayList();
		student2.add(s5);
		student2.add(s6);
		student2.add(s7);
		student2.add(s8);
		
		List<Student> student3 = new ArrayList();
		student3.add(s9);
		student3.add(s10);
		student3.add(s11);
		student3.add(s12);
		student3.add(s13);
		student3.add(s14);
		
		Class c1 = new Class();
		c1.setClassName("Nursery");
		c1.setClassTeacher("Manjulika");
		c1.setId(1);
		c1.setStudents(student1);
		
		Class c2 = new Class();
		c2.setClassName("LKG");
		c2.setClassTeacher("Juri Das");
		c2.setId(2);
		c2.setStudents(student2);
		
		Class c3 = new Class();
		c3.setClassName("UKG");
		c3.setClassTeacher("Mitali Baruah");
		c3.setId(3);
		c3.setStudents(student3);
		
		classMap.put(c1.getId(), c1);
		classMap.put(c2.getId(), c2);
		classMap.put(c3.getId(), c3);
	}
	public Class getClassDetails(int id)
	{
		return classMap.get(id);
		
		
	}
	
	public Student getStudentDetails(int id)
	{
		return studentMap.get(id);
		
		
	}
	
	

}
