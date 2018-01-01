package com.tk.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tk.base.TestBase;

public class ExploreTest extends TestBase {

	@Test
	public void exploreTest() throws InterruptedException {
		log.debug("inside Explore test");
		// click on explore
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@ng-class,'explore')][contains(@ng-click,'dashboard')]")).click();

		// click on summary
		driver.findElement(By.xpath("(//a[@class='pull-right m-r'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//label[@class='btn btn-success btn-outline ng-pristine ng-untouched ng-valid ng-not-empty'][2]"))
				.click();

		

		driver.findElement(By.xpath("(//a[text()='Show Distribution'])[3]")).click();
		//Thread.sleep(1000);
	//	driver.findElement(By.xpath("//*[name()='svg']/*[*[local-name()='g']]/*[*[local-name()='rect']]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//I[@class='fa fa-times-circle-o']")).click();
		Thread.sleep(2000);

	

	

		
		List<WebElement> distinct_list = driver.findElements(By.xpath("//tr[@ng-repeat='row in summary']/td[3]"));
		int distinct_size = distinct_list.size();
		System.out.println("Total distinct count is" + distinct_size);

		for (int i = 0; i < distinct_size; i++) {
//			System.out.println(distinct_list.get(i).getText());

			if (distinct_list.get(i).getText().contains("String")) {
				Assert.assertNotNull(distinct_list.get(i));
			}

				driver.findElement(By
						.xpath("//label[@class='btn btn-success btn-outline ng-pristine ng-untouched ng-valid ng-not-empty'][3]"))
						.click();
				Thread.sleep(3000);
				driver.findElement(
						By.xpath("//div[@class='input-group m-b']//input[@ng-model='correlationHightlightValue']"))
						.sendKeys(Keys.BACK_SPACE);
			}
		}

	}

