package TrialPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DevTools {
	//static WebDriver driver = new ChromeDriver();
	
	public static void main(String[]args) throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Andrew\\eclipse-workspace\\SeleniumProject\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://automationpractice.com/index.php";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		//driver.manage().window().wait();
		WebElement signin = driver.findElement(By.className("login"));
		signin.click();

	}
	
	
//	public void createNewlogin() {
//		WebElement create = driver.findElement(By.id("SubmitCreate"));
//		create.click();
//		WebElement error1 = driver.findElement(By.id("create_account_error"));
//		String Error1_message =error1.getText();
//		Error1_message.equalsIgnoreCase("Invalid email address.");
//		WebElement email = driver.findElement(By.id("email_create"));
//		email.sendKeys("lishaevangeline@gmail.com");
//		driver.findElement(By.id("customer_firstname")).sendKeys("Lisha");
//		driver.findElement(By.id("customer_lastname")).sendKeys("Eva");
//		driver.findElement(By.id("passwd")).sendKeys("p@ss");
//		// select from dropdown
//		driver.findElement(By.id("days")).sendKeys("18");
//		Select DOB = new Select(driver.findElement(By.id("months")));
//		DOB.selectByValue("December");
//		Select year = new Select(driver.findElement(By.id("years")));
//		DOB.selectByValue("1990");
//		
//	}
	}	