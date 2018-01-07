package com.SpELparent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ParentBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Machine machine = (Machine) context.getBean("Machine");
        System.out.println(machine.getProp());

        ExtendedMachine extendedMachine = (ExtendedMachine) context.getBean("ExtendedMachine");
        System.out.println(extendedMachine.getProp());
        System.out.println(extendedMachine.getName());

    }

}
