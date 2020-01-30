package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeDetails {

	public static void main(String[] args) {

		// Configuration the driver

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

//launch of browser

		WebDriver driver = new ChromeDriver();

// to get the URL

		driver.get("https://www.facebook.com/");

//To get the title

		String title = driver.getTitle();
		System.out.println(title);

//To get current page URL

		String cu = driver.getCurrentUrl();
		System.out.println(cu);

//To close the browser

		driver.quit();

		System.out.println("Additional Code");
		System.out.println("Additional Code");
		System.out.println("Additional Code");

	}

}
