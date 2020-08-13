import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConnectSeleniumToExistingBrowserThatWasOpenedManually {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "‪D:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAdress", "localhost:2020");
		
		WebDriver driver = new ChromeDriver(options);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Create an account")).click();
		System.out.println(driver.getTitle());


	}

}
