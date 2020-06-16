package com.meensat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.meensat.model.CustomerModel;
import com.meensat.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getAllCustomers() {
		ModelAndView m = new ModelAndView("index");
		m.addObject("listCustomer",service.getAllCustomers());
		return m;
	}
	
	@RequestMapping(value = "/new",method = RequestMethod.GET)
	public ModelAndView addCustomerDetails() {
		ModelAndView model = new ModelAndView("new_customer");
		return model;
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute CustomerModel customer) {
		System.out.println("CUST IDD : "+customer.getId());
		if(customer.getId()==null) {
			System.out.println("Saving New Customer ");
			service.saveCustomer(customer);
		}else {
			System.out.println("Updating Customer "+customer.getId());
			service.updateCustomer(customer);
		}
		return "redirect:/customer/";
	}
	@RequestMapping(value = "/edit")
	public ModelAndView editCustomer(@RequestParam Long id) {
		ModelAndView model = new ModelAndView("edit_customer");
		CustomerModel custModel = service.fetchCustomerById(id);
		model.addObject("customer", custModel);
		return model;
	}
	
	@RequestMapping(value = "/delete")
	public String deleteCustomer(@RequestParam Long id) {
		ModelAndView model = new ModelAndView("index");
		System.out.println("in delete Customer model" + id);
		service.deleteCustomer(id);
		return "redirect:/customer/";
		
	}
		
}
