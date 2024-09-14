package selenium.org.sshukla79;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("https://www.irctc.co.in/nget/train-search");
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
driver.findElement(By.cssSelector("a[aria-label$='Click here to Login in application']")).click();
//driver.switchTo().alert().accept();

WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("shivam1598");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Shivam7527@");
Thread.sleep(5000);
driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-repeat']")).click();

Thread.sleep(5000);
 String element =driver.findElement(By.xpath("//img[@class='captcha-img']")).getText();
 Thread.sleep(10000);
 // System.out.println(driver.findElement(By.xpath("//img[@class='captcha-img'][1]")).getText());
//  System.out.println("captcha "+ element);
//  Thread.sleep(5000);
//driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(element);
//Thread.sleep(3000);
driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
Thread.sleep(3000);

//System.out.println(driver.findElement(By.xpath("//div[@class='loginError']")).getText());
driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("ndls");
Thread.sleep(3000);
driver.findElement(By.cssSelector("#p-highlighted-option")).click();
driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("JNU");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'JAUNPUR JN - JNU')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector(".ui-datepicker-next-icon.pi.pi-chevron-right.ng-tns-c58-10")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[normalize-space()='24']")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("div:nth-child(2) div:nth-child(1) app-train-avl-enq:nth-child(1) div:nth-child(1) div:nth-child(5) div:nth-child(1) table:nth-child(1) tr:nth-child(1) td:nth-child(4) div:nth-child(1) div:nth-child(2) span:nth-child(1)")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//strong[normalize-space()='WL15']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='btnDefault train_Search ng-star-inserted']")).click()	;
driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Passenger Name']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='divMain']//li[5]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class="
		+ "'train_Search btnDefault']")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//button[@class='btnDefault train_Search']")).click();
}

}
