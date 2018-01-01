package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class zamzar {

	public static void main(String[] args) throws FindFailed {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.zamzar.com/");
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		
		Screen screen=new Screen();
		Pattern img1= new Pattern("C:\\Users\\admin\\Desktop\\loc.png");
		Pattern img2= new Pattern("C:\\Users\\admin\\Desktop\\open.png");
		
		
		driver.findElement(By.xpath("//*[@id='inputFile']")).click();
		screen.wait(img1, 10);
		screen.type(img1, "C:\\Users\\admin\\Desktop\\error.png");
		screen.click(img2);

	}

}
