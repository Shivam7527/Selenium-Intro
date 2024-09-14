package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowNavigator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.get("chrome://settings/clearBrowserData");
		//driver.navigate().to("https://rahulshettyacademy.com/");
//    driver.navigate().back();
//    driver.navigate().forward();
		driver.findElement(By.xpath("//cr-button[@id='clearButton' and text()='Delete data']")).click();
    }
	

}
