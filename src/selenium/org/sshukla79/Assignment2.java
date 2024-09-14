package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("sshukla79");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shivamshukla4879@gmail.com");
		driver.findElement(By.xpath("(//input[@id='exampleInputPassword1'])[1]")).sendKeys("Shivam7527@");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[2]")).click();
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='bday']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='bday'])[1]")).click();
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
	System.out.println(	driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

	}

}
