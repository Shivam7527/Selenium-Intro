package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	//System.out.println(	driver.findElement(By.xpath(
			//"(//*[name()='circle'])[7]")).isSelected());
	Assert.assertFalse(driver.findElement(By.xpath(
			"(//*[name()='circle'])[7]")).isSelected());
	driver.findElement(By.xpath("(//*[name()='circle'])[7]")).click();
	//System.out.println(	driver.findElement(By.xpath("(//*[name()='circle'])[7]")).isSelected());
	Assert.assertTrue(driver.findElement(By.xpath(
			"(//*[name()='circle'])[7]")).isSelected());
System.out.println(driver.findElements(By.xpath("//*[name()='circle'] [@r='8'][contains(@fill-rule,'evenodd')][contains(@stroke,'#DDDDDD')][contains(@stroke-width,'2')][@fill='#FFF']")).size());

	}

}
