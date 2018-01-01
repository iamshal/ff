package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String title=driver.getTitle();
		System.out.println(title);
		String x= driver.findElement(By.id("identifierNext")).getAttribute("value");
		System.out.println(x);
		
		driver.quit();
		
	}
}
