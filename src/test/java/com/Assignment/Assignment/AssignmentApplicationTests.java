package com.Assignment.Assignment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AssignmentApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(10, 10);
		assertEquals(15, AssignmentApplication.addition(10, 5));
	}

	@Test
	void customTest() {
		assertEquals(20, AssignmentApplication.addition(10, 10));
		assertEquals(12, AssignmentApplication.addition(10, 2));
	}

	@Test
	void multiplicationTest(){
		assertEquals(50, AssignmentApplication.multiplication(10, 5));
	}

}
