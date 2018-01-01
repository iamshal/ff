package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		String title=driver.getTitle();
		System.out.println(title);
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		int linklistsize=linklist.size();
		
		System.out.println(linklistsize);
		for(int i =0;i<linklistsize;i++){
			System.out.println(linklist.get(i).getText());
		}
	}

}
