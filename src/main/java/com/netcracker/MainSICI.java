package com.netcracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSICI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Box box = (Box) context.getBean("Box");
        box.useToy();

        Facility facility = (Facility) context.getBean("Facility");
        facility.getWorker().work();
        System.out.println(facility.getRegion());

        CollectionsBundle collectionsBundle = (CollectionsBundle) context.getBean("collectionsBundle");
        SeparateMapTestClass separateMapTestClass = (SeparateMapTestClass) context.getBean("separateMapTestClass");

        System.out.println(collectionsBundle.getTestList().toString());
        System.out.println(collectionsBundle.getTestSet().toString());
        System.out.println(separateMapTestClass.getTestMap().toString());

    }
}
