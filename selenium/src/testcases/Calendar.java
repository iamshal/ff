package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.sg/2016/08/how-to-handle-calendar-in-selenium.html");
driver.findElement(By.id("datepicker")).click();
   List<WebElement>date= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
   for(WebElement a:date)
   {
	  String Date=a.getText();
	  if(Date.equalsIgnoreCase("7"))
	  {
		  a.click();
		  break;
		  
	  
	  }
   }
	}

}
