package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindows {
public static void main(String[] args) throws InterruptedException{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://seleniumpractise.blogspot.sg/2017/07/multiple-window-examples.html");
	String parent=driver.getWindowHandle();
	System.out.println("parent window id is"  +parent);
	driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
	Set<String> allWindows=driver.getWindowHandles();
	int count=allWindows.size();
	System.out.println("Totlal Windows" +count);
	for(String child:allWindows)
		
	{
	if(!parent.equalsIgnoreCase(child))	
	{
		driver.switchTo().window(child);
		driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		System.out.println("child window title is" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
	}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

}
