package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Submenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.hdfcbank.com");
		
		

		Actions builder = new Actions(driver);
		Thread.sleep(3000);
		WebElement mouseElement = driver
				.findElement(By.xpath("//a[@href='/personal/making_payments/making-payments-landing']"));
		// mouse the cursor focus to mouse element
		builder.moveToElement(mouseElement).build().perform();
		// mouse hover on pay bills and shop
		Thread.sleep(3000);
		mouseElement = driver.findElement(
				By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[3]/div[2]/div[2]/div[1]/ul/li[6]/span"));
		builder.moveToElement(mouseElement).build().perform();
		mouseElement = driver.findElement(
				By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[3]/div[2]/div[2]/div[2]/div[6]/div/ul/li[4]/a"));
		builder.moveToElement(mouseElement).click().build().perform();

	}

}
