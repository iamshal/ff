package com.tk.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.tk.base.TestBase;

public class AssembleDataUpload extends TestBase {

	@Test
	public void assembleDataUpload() throws InterruptedException, IOException {
		log.debug("inside Assemble test");
		driver.findElement(By.xpath("//li[contains(@ng-click,'upload')]")).click();
		
		driver.findElement(By.xpath("//label[text()='Select file']/following-sibling::div//input[@type='file']")).sendKeys("C:\\Users\\admin\\Desktop\\income_class_data16");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(text(),'Analyze ')]")).click();
		
	

		

	}
}