package com.Mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Sim.Sim;

public class RelianceMobile{
    private ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    private Sim s = context.getBean(Sim.class);

    public RelianceMobile(){
        startMobile();
        try {
            s.startSim();
        } catch (NullPointerException e) {
            System.out.println("Insert Sim!!");
        }
        
    }
    private void startMobile(){
        System.out.println("Welecome to Reliance Mobile");
    }
}
