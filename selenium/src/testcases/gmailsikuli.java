package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class gmailsikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//A[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in'][text()='Sign In']"))
				.click();
		driver.findElement(By.xpath("//INPUT[@id='identifierId']")).sendKeys("iamshal1985@gmail.com");
		driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//INPUT[@type='password']")).sendKeys("khushi123");
		driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']")).click();

		driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
driver.findElement(By.xpath("html/body/div[13]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[4]/div/div[1]/div/div/div")).click();
	
	Screen screen=new Screen();
	Pattern img1= new Pattern("C:\\Users\\admin\\Desktop\\gmail1.png");
	Pattern img2= new Pattern("C:\\Users\\admin\\Desktop\\gmail2.png");
	
	
	driver.findElement(By.xpath("html/body/div[13]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
	screen.wait(img1, 10);
	screen.type(img1, "C:\\Users\\admin\\Desktop\\testdata.xlsx");
	screen.click(img2);

	
	
	}

}
