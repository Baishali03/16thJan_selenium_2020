package com.maven_demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNg_demo2 {
  @Test (priority=2)
  public void facebook() {
	  System.out.println("In facebook");
  }
  
  @Test (priority=-1)
  public void gmail() {
	  System.out.println("In gmail");
  }
  
  @Test (priority=1)
  public void google() {
	  System.out.println("In google");
  }
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("In LB");
  }
  
  @AfterTest
  public void closeBrowser() {
	  System.out.println("In AB");
  }
  
}
