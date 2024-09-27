package selenium.org.sshukla79;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	driver.get("https://google.com/");
	// take screenshot
	
	
	File src   =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
    FileUtils.copyFile(src,new File("C:\\Users\\shiva\\OneDrive\\Pictures\\Screenshots\\ss.png"));

	}

	
}
