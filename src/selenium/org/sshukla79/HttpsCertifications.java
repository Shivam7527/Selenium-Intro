package selenium.org.sshukla79;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpsCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by pass the certificate
		ChromeOptions op= new ChromeOptions();
		op.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		
		driver.get("https://expired.badssl.com/");
	System.out.println(	driver.getTitle());
	
	}

}
