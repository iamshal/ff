package com.tk.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tk.base.TestBase;

public class CreateModelTest extends TestBase {

	@Test
	public void createModelTest() throws InterruptedException {
		 log.debug("inside Explore test");
	driver.findElement(By.xpath("//P[text()='Create Models']")).click();
	
	driver.findElement(By.xpath("//div[@class='btn btn-success btn-outline m-r']")).click();
	
	}
}
