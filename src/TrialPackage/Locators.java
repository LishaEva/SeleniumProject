package TrialPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Andrew\\eclipse-workspace\\SeleniumProject\\src\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		// public static WebDriver driver = new ChromeDriver();
		String baseUrl = "http://automationpractice.com/index.php";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		// driver.manage().window().wait();
		WebElement signin = driver.findElement(By.className("login"));
		signin.click();
		newUser();
		driver.close();
	}

	public static void newUser() throws IOException, InterruptedException {

		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		WebElement error1 = driver.findElement(By.id("create_account_error"));
		String Error1_message = error1.getText();
		Error1_message.equalsIgnoreCase("Invalid email address.");
//		TakesScreenshot scrn = ((TakesScreenShot)driver);
//		File sourcefile = scrn.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(
				"C:\\Users\\Andrew\\eclipse-workspace\\SeleniumProject\\src\\TrialPackage\\ScreenShots\\scrnShot1.png");

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshotFile, DestFile);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement email = driver.findElement(By.id("email_create"));
		wait.until(ExpectedConditions.elementToBeClickable(email));

		email.sendKeys("lishaevangeline@gmail.com");
		
		driver.findElement(By.className("icon-user")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		Thread.sleep(3000);
		System.out.println("waiting for next page");
		//driver.manage().window().wait();
		driver.findElement(By.id("customer_firstname")).sendKeys("Lisha");
		driver.findElement(By.id("customer_lastname")).sendKeys("Eva");
		driver.findElement(By.id("passwd")).sendKeys("p@ss123");
		// select from dropdown
		driver.findElement(By.id("days")).sendKeys("18");
		Select DOB = new Select(driver.findElement(By.id("months")));
		DOB.selectByIndex(12);
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("1900");
		driver.findElement(By.name("firstname")).sendKeys("Lisha");
		driver.findElement(By.id("lastname")).sendKeys("Evangeline");
		driver.findElement(By.id("address1")).sendKeys("myaddress");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByIndex(2);
		Select country = new Select(driver.findElement(By.id("id_state")));
		country.selectByValue("21");
		driver.findElement(By.name("postcode")).sendKeys("54321");
		driver.findElement(By.name("phone_mobile")).sendKeys("987654321");
		driver.findElement(By.name("submitAccount")).click();

	}
	public static void login_existingUser() {
		driver.findElement(By.className("login")).click();
	}

}