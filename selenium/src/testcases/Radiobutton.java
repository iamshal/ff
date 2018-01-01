package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();
driver.get("http://www.facebook.com");
   WebElement maleele= driver.findElement(By.xpath("//*[@id='u_0_3']"));
   boolean status=maleele.isDisplayed();
   System.out.println("Male radio button is Displayed" +status);
   boolean enabled_status=maleele.isEnabled();
   System.out.println("Male radio button is enabled" +enabled_status);
   boolean selected_status=maleele.isSelected();
   System.out.println("Male radio button is selected" +selected_status);
   
   maleele.click();
   
   
   
	
	
	
	
	
	
	
	}

}
