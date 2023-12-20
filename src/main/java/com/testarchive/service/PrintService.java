package com.testarchive.service;
import com.testarchive.package1.Printer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PrintService {

    @Autowired
    @Qualifier("Printer1")
    private final Printer print1;

    @Autowired
    @Qualifier("Printer2")
    private final com.testarchive.package2.Printer print2;


    @Autowired
    public PrintService(@Qualifier("Printer1")Printer print1,@Qualifier("Printer2") com.testarchive.package2.Printer  print2) {
        this.print1 = print1;
        this.print2 = print2;

    }
    public void printMessages() {
     print1.printMessage("Message from 1st");
     print2.printMessage("Message from 2nd");

    }
}
