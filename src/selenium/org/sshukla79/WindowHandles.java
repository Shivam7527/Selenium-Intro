package selenium.org.sshukla79;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
	Set<String> windows=driver.getWindowHandles();//parentid,childid
   Iterator<String>it =windows.iterator();
   String parentId=it.next();
   String childId=it.next();
	
		driver.switchTo().window(childId);
	   String text=driver.findElement(By.cssSelector(".im-para.red")).getText();
	  driver.findElement(By.cssSelector(".im-para.red")).getText();
	  String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split(" ")[1];
      System.out.println(text);
  //  emailId= text.split(" ");
   //System.out.println(emailId[4]);
    Thread.sleep(3000);
    driver.switchTo().window(parentId);
    Thread.sleep(3000);
   
  // driver.findElement(By.cssSelector("#username")).click();
      driver.findElement(By.cssSelector("#username")).sendKeys(emailId);
       driver.close();
    //System.out.println( driver.getCurrentUrl());
    
   
	}

}

