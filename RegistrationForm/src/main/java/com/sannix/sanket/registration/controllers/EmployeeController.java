package com.sannix.sanket.registration.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.sannix.sanket.registration.entitiy.Employee;
import com.sannix.sanket.registration.services.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/getForm")
	public ModelAndView getForm() {
		String viewName="register";
		Map<String, Object> model = new HashMap<>();
		model.put("registerData", new Employee());
		return new ModelAndView(viewName, model);
		
	}
	@PostMapping("/getForm")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		
			employeeService.createEmployee(employee);
			RedirectView rd=new RedirectView();
			rd.setUrl("/getForm");
			return new ModelAndView(rd);
	}
}
