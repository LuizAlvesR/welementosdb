package com.jackrutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jackrutorial.model.Student;
import com.jackrutorial.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	
	@Autowired
	StudentService articleService;
	
	@RequestMapping(value = "/addStudent/", method = RequestMethod.GET)
	public ModelAndView addStudent() {
		ModelAndView model = new ModelAndView();
		
		Student student = new Student();
		model.addObject("createStudent", student);
		model.setViewName("createStudent");
		
		return model;
	}
	
	@RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") long id) {
		articleService.deleteStudent(id);
		
		return new ModelAndView("redirect:/article/list");
	}
	
	@RequestMapping(value = "/updateStudent/{id}", method = RequestMethod.GET)
	public ModelAndView editStudent(@PathVariable long id) {
		ModelAndView model = new ModelAndView();
		
		Student article = articleService.getStudentById(id);
		model.addObject("articleForm", article);
		model.setViewName("article_form");
		
		return model;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("article_list");
		List<Student> articleList = articleService.getAllStudents();
		model.addObject("articleList", articleList);
		
		return model;
	}
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("articleForm") Student article) {
		articleService.saveOrUpdate(article);
		
		return new ModelAndView("redirect:/article/list");
	}
}