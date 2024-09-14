package selenium.org.sshukla79;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {
	public static void  main(String[] args) {
		
		//Invoking Browser
		//webdriver methods + class method
		//ChromeDriver driver = new ChromeDriver();
		// WebDriver interface
		//Selenium Manager
	//	System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
	//	WebDriver driver  = new FirefoxDriver();
	
	//System.setProperty("webdriver.gecko.driver", "C:/Users/shiva/OneDrive/Documents/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:/Users/shiva/OneDrive/Documents/msedgedriver.exe");

//WebDriver driver = new EdgeDriver();
//
//		
//				
//		//driver.get("https://rahulshettyacademy.com/");
//     //   driver.get("https://poki.com/en/g/super-tunnel-rush");
//		System.out.println(driver.getTitle());
//	    System.out.println(driver.getCurrentUrl());
	
	
		//driver.close();
		String s ="Cauliflower - 1 Kg";
	String[] ss= s.split("-");
		System.out.println(ss[1]);
		//driver.quit();
	}

}
