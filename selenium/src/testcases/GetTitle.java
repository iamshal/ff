package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

	
	
	
	
	
}
