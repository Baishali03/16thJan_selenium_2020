package com.maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello_selenium {

	//public static void main(String[] args) throws Exception {
		@Test
		public void rediffLogin() {
			
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Baishali");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Baishali03");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys("Baishali@123");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys("Baishali@123");
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("baishalichakra@gmail.com");
	
	}

}
