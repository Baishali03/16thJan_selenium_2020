package com.maven_demo;

import org.testng.annotations.Test; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void login() {
	  System.out.println("i am in login test");
  }
  
  @Test
  public void register() {
	  System.out.println("i am in register test");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am in After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in before test");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in before suite");}

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in After Suite");
  }

}
