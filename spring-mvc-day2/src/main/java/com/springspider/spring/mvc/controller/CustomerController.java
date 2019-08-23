package com.springspider.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springspider.spring.mvc.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	List<Customer> customerlist = new ArrayList<Customer>();
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<Customer> listCustomer = customerlist;
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listCustomer", listCustomer);
		return mav;
	}
	
	@RequestMapping("/new")
	public String newCustomerForm(Map<String, Object> model) {
		Customer customer = new Customer();
		model.put("customer", customer);
		return "new_customer";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		if(customer.getId()==null) {
			saveNewCustomer(customer, customerlist);
		}else {
			updateCustomer(customer, customerlist);
		}
		return "redirect:/customer/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editCustomerForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_customer");
		Customer customer = getCustomerById(id);
		mav.addObject("customer", customer);
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteCustomerForm(@RequestParam long id) {
		//customerService.delete(id);
		deleteCustomerById(id);
		return "redirect:/customer/";		
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		//List<Customer> result = customerService.search(keyword);
		List<Customer> result = searchCustomers(keyword);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);
		
		return mav;		
	}	
	
/*	private List<Customer> getCustomerList(List<Customer> cust){
		Customer cust1 = new Customer();
		cust1.setId(101L);
		cust1.setName("XYZ");
		cust1.setAddress("street xyz");
		cust.add(cust1);
		return cust;
	}*/
	
	private Customer getCustomerById(long id) {
		Customer customer = new Customer();
		for(Customer cust : customerlist) {
			if(cust.getId() == id) {
				customer = cust;
			}
		}
		return customer;
	}
	
	private void deleteCustomerById(long id) {
		Customer customer= null;
		for(Customer cust : customerlist) {
			if(cust.getId() == id) {
				customer = cust;
			}
		}
		customerlist.remove(customer);
	}
	
	private List<Customer> searchCustomers(String key){
		
		List<Customer> searchResult = customerlist.stream().filter(p -> p.getName().equals((key)))
				.collect(Collectors.toList());
		return searchResult;
	}
	
	private void updateCustomer(Customer customer, List<Customer> customerlist) {
		
		
		if(customerlist.size()>0 && customer.getId()!=null) {
			for(Customer cust : customerlist) {
				if(cust.getId().equals(customer.getId()) ) {
					cust.setName(customer.getName());
					cust.setEmail(customer.getEmail());
					cust.setAddress(customer.getAddress());
				}
			}
		}

	}
	
	private void saveNewCustomer(Customer customer, List<Customer> customerlist) {
		customer.setId(customerlist.size()+1L);
		customerlist.add(customer);
	}
	
	
}
