package com.tk.rough;

import java.util.Date;

import com.tk.base.TestBase;

public class TestTimeStamp extends TestBase {

	public static void main(String[] args) {


		Date d= new Date();
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		System.out.println(screenshotName);
		System.out.println(d);

	}

}
