package TrialPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstClass {
	// this class is a simplest code where it is executed as a java file.
	// No cucumber/junit/testng hence no decent reports- completely JAVA

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Andrew\\eclipse-workspace\\SeleniumProject\\src\\Drivers\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://automationpractice.com/index.php";
		String expectedTitle = "My Store";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		// close broswer
		driver.close();
		

	}

}
