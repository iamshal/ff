package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}

}
