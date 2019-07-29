package com.greenhorn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.greenhorn.spring.model.Address;
import com.greenhorn.spring.model.Employee;
import com.greenhorn.spring.service.EmployeeService;



public class ClientXMLApplication {

	public static void main(String[] args) {

		/* =================== BeanFactory Start===================*/
/*		BeanFactory factory = new XmlBeanFactory (new ClassPathResource("applicationContext.xml")); 
		Address obj = (Address) factory.getBean("address");  
		System.out.println(obj.getState());  */
		/* =================== BeanFactory End===================*/
		
		/* =================== ApplicationContext Start===================*/
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		/*Address add = (Address)context.getBean("address");
		add.setCity("HYD");
		System.out.println(add.getCity());*/
/*		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());*/
		
		EmployeeService empService = (EmployeeService)context.getBean("employeeService");
		empService.addEmployee();
		System.out.println(empService.empList.size());
		System.out.println(empService.getEmp());
		
		/* =================== ApplicationContext End===================*/
	}
}
/* ----------------- point to note ---------------- 
 * 
 * ClassPathXmlApplicationContext is used to get the ApplicationContext object by providing the configuration files location. It has multiple overloaded constructors and we can provide multiple config files also.
 */
