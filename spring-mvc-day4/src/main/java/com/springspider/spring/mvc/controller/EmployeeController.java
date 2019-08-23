package com.springspider.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("employee-page");
		model.addObject("msg", "hello world=========");

		return model;
	}
	
	
	@RequestMapping("/{id}")
    public String handler1(@PathVariable("id") String employeeId) {
    	System.out.println("ID :: "+employeeId );
    
        return "employee-page";
    }
    
    @RequestMapping("/name/{id}")
    public String handler2(@PathVariable("id") String empName) {
    	System.out.println("Name :: "+empName );
    
        return "employee-page";
    }

//    private Employee getEmployeeById(String employeeId) {
//        //todo: call to backend instead
//        Employee employee = new Employee(employeeId, RandomUtil.getFullName(),
//                RandomUtil.getAnyOf("Admin", "IT", "Sales"));
//        return employee;
//    }
}