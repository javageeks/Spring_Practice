package org.com.greenhorn.spring.core.scopePrototype;

import org.com.greenhorn.spring.core.scopePrototype.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context  = new AnnotationConfigApplicationContext("org.com.greenhorn.spring.core.scopePrototype");
		Person person1 =  context.getBean(Person.class);
		Person person2 =  context.getBean(Person.class);
		
		person1.setName("Adyan");
		
		System.out.println(person1.getName());
		
		
    	
    }
}
