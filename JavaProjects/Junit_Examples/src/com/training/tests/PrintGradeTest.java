package com.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.domains.PrintGrades;

public class PrintGradeTest {
	private PrintGrades printerGrader;
	
	@Before
	public void init(){
		printerGrader = new PrintGrades();
	
	}
	@Test
	public void testGradeD() {
		String actual = printerGrader.findResult(35);
		assertEquals("D", actual);
	}
	@Test
	public void testGradeB() {
		String actual = printerGrader.findResult(60);
		assertEquals("B", actual);
	}
	@Test
	public void testGradeC() {
		String actual = printerGrader.findResult(59);
		assertEquals("C", actual);
	}
	
	@Test
	public void testGradeOVER() {
		String actual = printerGrader.findResult(65);
		assertEquals("B", actual);
	}	
}
