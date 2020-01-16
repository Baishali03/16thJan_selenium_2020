package com.maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop {
	WebDriver driver;
    @BeforeTest
     public void launch_browser() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");

          driver= new ChromeDriver();
          driver.get("http://jqueryui.com/droppable");
          Thread.sleep(3000);
          String str=driver.getTitle();
          System.out.println(str);
    }

	@Test
	public void actions_demo() {
		// TODO Auto-generated method stub
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement tgt=driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
		act.dragAndDrop(src, tgt).build().perform();
	}

}
