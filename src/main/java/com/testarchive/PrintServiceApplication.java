package com.testarchive;

import com.testarchive.package1.Printer;
//import com.testarchive.package2.Printer;


import com.testarchive.service.PrintService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.testarchive.package1", "com.testarchive.package2", "com.testarchive"})
	public class PrintServiceApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext context1 = SpringApplication.run(PrintServiceApplication.class, args);
		PrintService printerService = context1.getBean(PrintService.class);
		printerService.printMessages();



	}
}











//
//		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrintServiceApplication.class)) {
//			PrintService myService2 = context.getBean(PrintService.class);
//			myService2.printMessages();
//		}
