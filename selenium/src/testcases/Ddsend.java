package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ddsend {
	
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://india.westernunion.com/WUCOMWEB/staticMid.do?method=load&countryCode=IN&languageCode=en&pagename=HomePage");
		
		
		
		driver.findElement(By.xpath("[@id='countryCodeDD']")).sendKeys("India");
		driver.quit();

}
}
