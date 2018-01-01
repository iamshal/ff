package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("u_0_g")).sendKeys("Shalini");
		driver.findElement(By.id("u_0_i")).sendKeys("Seth");
driver.findElement(By.id("u_0_y")).click();

	}

}
