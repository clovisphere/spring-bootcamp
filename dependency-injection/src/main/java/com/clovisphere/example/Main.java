package com.clovisphere.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    private static final String TITLE = "Speed";

    // starts program execution
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        RentalService rentalService = context.getBean("rentalService", RentalService.class);
        List<RentalLocation> locations = rentalService.find(TITLE, "1200", 10);

        System.out.printf("%s is available at the following locations:\n", TITLE);
        for(RentalLocation location: locations) {
            System.out.println(location.getLocation());
        }
    }
}