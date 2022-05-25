package com.CapitalOneBank.QA.Homepage;

import org.testng.annotations.Test;

import capitalOneBank.QA.Base.BaseClass;

public class HomeTest extends BaseClass{

	@Test(groups = {"home"})
	public void homeTest1() {
		System.out.println("Hometest1");
	}
	
	@Test(groups = {"home"})
	public void homeTest2() {
		System.out.println("Hometest2");
	}
}
