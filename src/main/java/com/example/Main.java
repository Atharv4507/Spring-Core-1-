package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

import com.Mobile.RelianceMobile;
import com.dao.StudentDao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new RelianceMobile();
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentDao sd = context.getBean(StudentDao.class);
        Student s1 = context.getBean("s2",Student.class);
        s1.setSname("Amar");
        s1.setScity("Nagpur");
        s1.setSpercentage(90.67);
        System.out.println(s1);
        System.out.println(sd.insertStudent(s1));
        
    }
}