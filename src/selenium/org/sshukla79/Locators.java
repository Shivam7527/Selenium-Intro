package selenium.org.sshukla79;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sshukla79");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy1");
		driver.findElement(By.className("signInBtn")).click();
 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sshukla");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sshukla4879@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("sshukla4879@gmail.com");
driver.findElement(By.xpath("//form/input[3]")).sendKeys("9458707527");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("#inputUsername")).sendKeys("sshukla79");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
	//System.out.println(driver.findElement(By.tagName("p")).getText());
	Thread.sleep(2000);
	
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
Thread.sleep(3000);
//	
	driver.findElement(By.cssSelector(".logout-btn")).click();	
	Thread.sleep(2000);
	
	
	//driver.close();
	
	}
//	public static String getPassword(WebDriver driver) throws InterruptedException {
//		
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.linkText("Forgot your password?")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//          String passwordText=   driver.findElement(By.cssSelector("form p")).getText();
//          //rahulshettyacademy' to Login
//       String[] passwordArray=     passwordText.split("'");
//         String password= passwordArray[1].split("'")[0];
//         
//         return password;
//          
//	}

}
