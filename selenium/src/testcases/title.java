package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class title {
	public static void main(String[] args){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://amazon.com");
	System.out.println(driver.getTitle());
	
}
}