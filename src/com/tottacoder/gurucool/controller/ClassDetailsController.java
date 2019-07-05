package com.tottacoder.gurucool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tottacoder.gurucool.service.ClassService;

@Controller
public class ClassDetailsController {
	

@RequestMapping(value="/class/{id}")
@ResponseBody
public ModelAndView getClassDetails(@PathVariable("id") int id){
	ClassService cs = new ClassService();
	return new ModelAndView("classDetails", "classDetails", cs.getClassDetails(id));
}




	

}
