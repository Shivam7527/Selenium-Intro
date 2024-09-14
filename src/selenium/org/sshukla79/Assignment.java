package selenium.org.sshukla79;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
	Set<String>windows=	driver.getWindowHandles();
	Iterator<String>it=windows.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	//String subId=it.next();
	Thread.sleep(3000);
	String text=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
	System.out.println(text);
driver.switchTo().window(parentId);
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	
		
		

	}

}
