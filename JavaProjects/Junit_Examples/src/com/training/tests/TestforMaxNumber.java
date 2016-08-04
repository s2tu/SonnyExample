package com.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.training.domains.PrintMax;

public class TestforMaxNumber {

	PrintMax maxprinter = new PrintMax();
	@Test
	public void testFindMaxwithPositives() {
		int[] positives ={1,2,3};
		int actual = maxprinter.findMax(positives);
		assertEquals(3, actual);
	}
	@Test  //there is a defect here
	public void testFindMaxwithNegatives() {
		int[] negatives ={-1,-2,-3};
		int actual = maxprinter.findMax(negatives);
		assertEquals(-1, actual);
	}
}
