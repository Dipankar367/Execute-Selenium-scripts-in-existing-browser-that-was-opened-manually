import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConnectSeleniumToExistingBrowserThatWasOpenedManually {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");   
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:2020");
		
		WebDriver driver = new ChromeDriver(options);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Get Gmail")).click();
		System.out.println(driver.getTitle());


	}

}
