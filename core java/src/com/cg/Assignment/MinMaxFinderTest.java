package com.cg.Assignment;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MinMaxFinderTest {
	MinMaxFinder minmax;
	int[] arr1 = {56,34,7,3,58,3,34,1,53};
	int[] arr2 = {56,37,7,99,31,34,8,10};
	int[] arr3 = {11,89,29,121,12,55};

	int[] expectedval1 = {1,58};
	int[] expectedval2 = {7,99};
	int[] expectedval3 = {11,121};
	
	@BeforeAll
	void init() {
	minmax = new MinMaxFinder();
	}
	
	@Test
	void arr1testcase() {
		fun(arr1,expectedval1);
		fun(arr2,expectedval2);
		fun(arr3,expectedval3);
	}
	
	private void fun(int[] arr, int[] expectedval) {
		// TODO Auto-generated method stub
		int[] actualval = minmax.findMinMax(arr);
		assertNotNull(Arrays.toString(actualval),"No data Found");
		assertEquals(Arrays.toString(expectedval),Arrays.toString(actualval));
		assertArrayEquals(expectedval ,actualval,"mismatch");
		assertTrue(actualval.length==2);
		assertTrue(actualval[0]<actualval[1]);
	}
}