package com.tottacoder.gurucool.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tottacoder.gurucool.model.Subject;
import com.tottacoder.gurucool.model.Teacher;

public class SubjectService {
	
	
private Map<Integer,Subject> subjectMap ;
	
	public SubjectService()
	{
		subjectMap = new HashMap();
		initializeMap();
	}
	private void initializeMap()
	{
		Teacher t1 = new Teacher();
		t1.setName("Devendra Sharma");
		t1.setId(210);
		
		Teacher t2 = new Teacher();
		t2.setName("Six Finger Mishra");
		t2.setId(209);
		
		Teacher t3 = new Teacher();
		t3.setName("Polu");
		t3.setId(666);
		
		Teacher t4 = new Teacher();
		t4.setName("Bansal");
		t4.setId(209);
		
		Teacher t5 = new Teacher();
		t5.setName("Sanjay Rajora");
		t5.setId(209);
		
		
		
		List<Teacher> mathsTeachers = new ArrayList();
		mathsTeachers.add(t1);
		mathsTeachers.add(t4);
		
		List<Teacher> physicsTeachers = new ArrayList();
		physicsTeachers.add(t2);
		
		List<Teacher> bioTeachers = new ArrayList();
		bioTeachers.add(t3);
		
		List<Teacher> organicTeachers = new ArrayList();
		organicTeachers.add(t5);
		
		
		Subject s1 = new Subject();
		s1.setSubjectName("Maths");
		s1.setHOD(t1);
		s1.setId(1);
		s1.setTeachers(mathsTeachers);
		
		Subject s2 = new Subject();
		s2.setSubjectName("Physics");
		s2.setHOD(t2);
		s2.setId(2);
		s2.setTeachers(physicsTeachers);
//		
//		Subject s1 = new Subject();
//		s1.setSubjectName("Maths");
//		s1.setHOD(t1);
//		s1.setId(1);
//		s1.setTeachers(mathsTeachers);
//		
//		Subject s1 = new Subject();
//		s1.setSubjectName("Maths");
//		s1.setHOD(t1);
//		s1.setId(1);
//		s1.setTeachers(mathsTeachers);
		
		subjectMap.put(s1.getId(), s1);
		subjectMap.put(s2.getId(), s2);
		
	}
	
	public Subject getSubjectDetails(Integer id)
	{
		return subjectMap.get(id);
		
		
	}
	
}
