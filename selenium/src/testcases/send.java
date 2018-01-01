package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;



public class send {
	
	public static void main(String[] args) throws InterruptedException{
		


		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://dss.tookitaki.com/#/login?redirect_to=%2Fapp%2Fdashboard");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[1]/input")).sendKeys(" tookitakiuser");
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/input")).sendKeys("Tookitaki123!");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
				//assemble= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//p[text()='Upload Data']")));
		
	


Thread.sleep(5000);
driver.findElement(By.xpath("//li[contains(@ng-click,'upload')]")).click();

Assert.fail("file not uploaded");


//Take screenshot and store as a file format
File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
// now copy the  screenshot to desired location using copyFile //method
FileUtils.copyFile(src, new File("C:\\Users\\admin\\workspace\\selenium\\src\\testcases\\error.png"));
}

catch (IOException e)
{
System.out.println(e.getMessage());

}







driver.navigate().to("https://dss.tookitaki.com/#/app/dashboard");

	//driver.findElement(By.xpath("//li[contains(@ng-class,'explore')][contains(@ng-click,'dashboard')")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//li[contains(@ng-class,'analysis')][contains(@ng-click,'dashboard')]")).click();
	driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]")).click();
	
	
	
	driver.quit();
	
}
}
