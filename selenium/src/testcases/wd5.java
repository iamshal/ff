package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wd5 {
	public static void main(String[] args){
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.hdfcbank.com");
		String x=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input")).getAttribute("value");
		System.out.println(x);
		
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("personal loan");
		String y=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input")).getAttribute("value");
		System.out.println(y);
	
	
	
	
	}

}
