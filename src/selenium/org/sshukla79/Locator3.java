package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Sibling to Sibling
			System.out.println(	driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
			// child to parent
			System.out.println(	driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
