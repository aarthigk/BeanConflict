package com.testarchive.package1;

import org.springframework.stereotype.Component;

@Component("Printer1")
public class Printer {
    public void printMessage(String message) {
        System.out.println("Package 1 Printer: " + message);
    }
}
