package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement month_dropdown= driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		WebElement selected_value=month_dd.getFirstSelectedOption();
		
		System.out.println("before selection selected value is "+selected_value.getText());
		
		month_dd.selectByIndex(3);
		WebElement Selected_value1=month_dd.getFirstSelectedOption();
		
		System.out.println("After selection selected value is "+Selected_value1.getText());
		
		
		
	//to print the months
List<WebElement>month_list=month_dd.getOptions();
int total_month=month_list.size();
System.out.println("Total month count is" +total_month);
for(WebElement ele:month_list)
{
	String month_name=ele.getText();
	System.out.println("months are=="+month_name);
}
	


	}

}
