package com.meensat.springcore;

import com.meensat.springcore.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Student student = new Student();
       student.setStudentId(200);
       student.setsName("Abhi");
       
       Student student2 = new Student();
       student2.setStudentId(300);
       student2.setsName("AbhiK");
       
       System.out.println(student.getsName());
       System.out.println(student2.getsName());
    }
}
