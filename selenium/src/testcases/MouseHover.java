package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.sg/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
	Actions builder=new Actions(driver);
	builder.moveToElement(ele).build().perform();
List<WebElement> links=driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
int count=links.size();
for(int i=0;i<count;i++)
{
	WebElement element=links.get(i);
	String text=element.getAttribute("innerHTML");
	boolean status=element.isEnabled();
	System.out.println("link name is" +text + "link status is" +status);
	
}

	}

}
