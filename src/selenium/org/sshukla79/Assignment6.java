package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
	String text=	driver.findElement(By.xpath("//label[@for='benz']")).getText();
	System.out.println(text);
	driver.findElement(By.id("dropdown-class-example")).sendKeys(text);
	Thread.sleep(2000);
driver.findElement(By.cssSelector("#name")).sendKeys(text);

Thread.sleep(2000);
driver.findElement(By.cssSelector("#alertbtn")).click();
System.out.println( driver.switchTo().alert().getText());
String [] s=driver.switchTo().alert().getText().split(" ");
    
 Assert.assertEquals(s[1].split(",")[0],text);

	}

}
