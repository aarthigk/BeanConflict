package com.testarchive.package2;



import org.springframework.stereotype.Component;


@Component("Printer2")
public class Printer {

    public void printMessage(String message) {
        System.out.println("Package 2 Printer: " + message);
    }
}
