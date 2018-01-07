package com.SpELparent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfig.class);

        Machine machine = context.getBean(Machine.class);
        ExtendedMachine extendedMachine = context.getBean(ExtendedMachine.class);

        System.out.println(machine);
        System.out.println(extendedMachine);

    }
}
