package com.Assignment.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
		printSomething("testing....");
		test();
	}

	public static void printSomething(String text) {
		System.out.println(text);
	}

	public static void test(){
		System.out.println("test");
	}
}
