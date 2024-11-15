package com.regal.EmployeeProject.web.EmployeeProject.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.regal.EmployeeProject.web.EmployeeProject.model.EmployeeModel;
import com.regal.EmployeeProject.web.EmployeeProject.service.EmailService;
import com.regal.EmployeeProject.web.EmployeeProject.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	EmployeeServiceImpl service;
	
	@Autowired
	EmailService mail;
	
	@Autowired
	public void setService(EmployeeServiceImpl service ) {
		this.service = service;
	}
	
	@GetMapping("/")
	public String getIndex() {
//		System.out.println("index method called");
		return "index";
	}
	
    @GetMapping("employee")
    public ModelAndView employee(@RequestParam("sso") Integer sso, ModelAndView mv, HttpSession session) {
//        System.out.println("employee method called");
        session.setAttribute("sso", sso);
        EmployeeModel employeeModel = service.getEmployeeDetails(sso);
        mv.addObject("employeeModel", employeeModel);
        mv.setViewName("employee");  // Maps to employee.jsp
        return mv;
    }
	
	@GetMapping("result")
	public ModelAndView result(HttpSession session, ModelAndView mv) {
//		System.out.println("result method called");
		EmployeeModel employeeModel = service.getEmployeeDetails((int) session.getAttribute("sso"));
		mv.addObject("employeeModel", employeeModel);
		mv.setViewName("result");
		return mv;	
	}
	
	@PostMapping("success")
	public String success(@ModelAttribute("employeeModel") EmployeeModel employeeModel) {
//		System.out.println("Success method called");
		service.updateEmployeeDetails(employeeModel);
		mail.sendMail("xyz@gail.domain");
		return "success";	
	}
	
}