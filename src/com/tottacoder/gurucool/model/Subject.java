package com.tottacoder.gurucool.model;

import java.util.List;

public class Subject {
	
	private Teacher HOD;

	private List<Teacher> teachers;
	
	private String subjectName;
	
	private int subjectId;

	public Teacher getHOD() {
		return HOD;
	}

	public void setHOD(Teacher HOD) {
		this.HOD = HOD;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getId() {
		return subjectId;
	}

	public void setId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	

}
