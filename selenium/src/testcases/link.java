package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		

	WebDriver driver=new FirefoxDriver();
	
	
	driver.get("http://www.hdfcbank.com");
	
	String x=driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/div/ul/li[5]")).getText();
	System.out.println(x);
	
	driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/div/ul/li[5]")).click();
	driver.findElement(By.linkText("Car Loan")).click();
	}
}
