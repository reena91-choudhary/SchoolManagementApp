package com.tottacoder.gurucool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tottacoder.gurucool.model.Subject;
import com.tottacoder.gurucool.service.SubjectService;

@Controller
public class SubjectDetailsController {
	

@RequestMapping(value="/subject/{id}")
@ResponseBody
public ModelAndView getSubjectDetails(@PathVariable("id") Integer id){

	SubjectService ts = new SubjectService();
	Subject subject = ts.getSubjectDetails(id);
	return new ModelAndView("subjectDetails", "subjectDetails", subject);
}


	

}