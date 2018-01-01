package com.tk.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tk.base.TestBase;

public class TkLoginTest extends TestBase{
	
	
	@Test
	public void tkLoginTest() throws InterruptedException{
		log.debug("inside login test");
		driver.findElement(By.xpath("//INPUT[@id='ttaipuser']")).sendKeys(" nnnr");

		driver.findElement(By.xpath("//INPUT[@id='ttaippass']")).sendKeys("bb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//A[@ui-sref='app.settings']")).click();
		Thread.sleep(5000);
		String c = driver.findElement(By.xpath("//table[@class='table table-bordered']//tbody//tr[2]//td[4]"))
				.getText();
		//System.out.println("001");
		if (c.contains("stopped")){
			//System.out.println("002");
			driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[2]/td[6]/button")).click();
			//System.out.println("clicked");	
		}
		//System.out.println("003");
		WebDriverWait wait= new WebDriverWait(driver, 200);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table table-bordered']//tr[2]//td[4]/span")));
		//System.out.println("005");
		 
		System.out.println(c);

		//System.exit(0);
		// System.out.println("Start button is Displayed" );

		// strt.click();

	
		Thread.sleep(7000);

		

		driver.findElement(By.xpath("//A[@ui-sref='app.dashboard']")).click();
		Thread.sleep(5000);
		
	}

}
