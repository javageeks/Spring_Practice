package org.example1;

import org.example1.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Employee emp = (Employee)context.getBean("employee");
    	
    	emp.printEmployeeDetails();
    	
    	


      /*  Employee emp = new Employee();
         
        emp.setName("Abc");
        emp.setAge(15);
        //emp.setAdd(add);
        
        emp.printEmployeeDetails();*/
       
    }
}
