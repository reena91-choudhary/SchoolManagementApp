package com.tottacoder.gurucool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tottacoder.gurucool.service.ClassService;

@Controller
public class StudentDetailsController {
	
	private ClassService cs;
	
	public StudentDetailsController(ClassService service)
	{
		this.cs = service;
	}

@RequestMapping(value="/class/student/{id}")
@ResponseBody
public ModelAndView getClassDetails(@PathVariable("id") int id){
	
	return new ModelAndView("studentDetails", "studentDetails", cs.getStudentDetails(id));
}


	

}