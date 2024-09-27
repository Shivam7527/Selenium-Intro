package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("ind");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ui-id-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"))
				.getAttribute("value");

		System.out.println(text);
		if (text.toLowerCase().contains("ind")) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");
		}
	}
}