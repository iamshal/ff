package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://www.facebook.com");
driver.manage().window().maximize();
WebElement month_dropdown= driver.findElement(By.id("month"));
Select month_dd=new Select(month_dropdown);
month_dd.selectByIndex(3);

Thread.sleep(3000);
month_dd.selectByValue("10");

Thread.sleep(3000);
month_dd.selectByVisibleText("Aug");

	}

}
