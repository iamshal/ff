package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Explore {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo-dss.tookitaki.com/#/repository/upload?product_id=2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@eva-model='vm.evaModel']")).sendKeys("C:\\Users\\admin\\Desktop\\income_class_data15 ");
	}
}
