package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
WebDriver driver  = new ChromeDriver();

driver.get("https://spicejet.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][normalize-space()='From']")).click();
driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();

	}

}
