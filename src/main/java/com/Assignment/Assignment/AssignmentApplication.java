package com.Assignment.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
		printSomething("testing....");
		test();
		System.out.println("The sum is: "+ addition(10, 5));
		System.out.println("The multiplication is: "+ multiplication(10, 5));
	}

	public static void printSomething(String text) {
		System.out.println(text);
	}

	public static void test(){
		System.out.println("test");
	}

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static int multiplication(int number1, int number2) {
		return number1 * number2;
	}
}
