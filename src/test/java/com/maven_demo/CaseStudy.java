package com.maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy {
    WebDriver driver;
     @BeforeTest
      public void launch_browser() throws InterruptedException {
             System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");

           driver= new ChromeDriver();
           driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
           Thread.sleep(3000);
        }

@Test
public void registration() throws InterruptedException {
      driver.findElement(By.linkText("SignUp")).click();
      Thread.sleep(5000);
      driver.findElement(By.id("userName")).sendKeys("paras123");
      driver.findElement(By.id("firstName")).sendKeys("paras");
      driver.findElement(By.id("lastName")).sendKeys("taneja");
      driver.findElement(By.id("password")).sendKeys("abcde123");
      driver.findElement(By.id("pass_confirmation")).sendKeys("abcde123");
      driver.findElement(By.xpath("//input[@value='Male']")).click();
     
      driver.findElement(By.id("emailAddress")).sendKeys("paras123@gmail.com");
      driver.findElement(By.id("mobileNumber")).sendKeys("9971487575");
      driver.findElement(By.id("dob")).sendKeys("02/14/1998");
      driver.findElement(By.id("address")).sendKeys("a-221 uttam nagar");
     WebElement security= driver.findElement(By.name("securityQuestion"));
     Select s1= new Select(security);
     s1.selectByVisibleText("What is your Birth Place?");
    
    

      driver.findElement(By.id("answer")).sendKeys("delhi");
      driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
}
@Test
public void login() {
}

@Test
public void add_product() {
}
@Test
public void payment() {
}
@Test
public void logout() {
}


@AfterTest
public void close_browser() {
}
}