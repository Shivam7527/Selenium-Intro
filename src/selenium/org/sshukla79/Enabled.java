
package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
	
//		if(driver.findElement(By.cssSelector(".css-76zvg2.css-bfa6kz.r-homxoj.r-ubezar.")).getAttribute("style").contains("font-family: inherit; opacity: 1;"))
//		{
//			
//			driver.findElement(By.xpath("(//*[name()='circle'])[3]")).click();
//		}
		
	//System.out.println(	driver.findElement(By.cssSelector(".css-76zvg2.css-bfa6kz.r-homxoj.r-ubezar.")).getAttribute("style").contains("font-family: inherit; opacity: 1;"));
		driver.findElement(By.xpath("(//*[name()='circle'])[3]")).click();
	}

}