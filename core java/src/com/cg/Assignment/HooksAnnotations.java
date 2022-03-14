package com.cg.Assignment;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HooksAnnotations {

	@BeforeAll
	static void befall(){
		System.out.println("@BeforeAll executed");
	}

	@BeforeEach
	void befeach(){
		System.out.println("@BeforeEach executed");
	}

	@Test
    void testCalcmultiply()
	{
		System.out.println("------TEST Multiply------");
		assertEquals( 4 , Calculator.multiply(2, 2));
    }

    @Test
    void testCalcadd()
   {
		System.out.println("------TEST Add------");
		assertEquals( 6 , Calculator.add(2, 4));
    }

	@AfterEach
	void afteach(){
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void aftall(){
		System.out.println("@AfterAll executed");
	}
}