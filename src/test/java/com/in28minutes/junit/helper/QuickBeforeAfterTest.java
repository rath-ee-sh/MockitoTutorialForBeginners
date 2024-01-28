package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	// Runs at the start of the class once.
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
	}

	//Runs before every test
	@Before
	public void setup(){
		System.out.println("Before Test");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

	//Runs after every test
	@After
	public void teardown() {
		System.out.println("After test");
	}

	//Runs at the end of the class once.
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class");
	}

}
