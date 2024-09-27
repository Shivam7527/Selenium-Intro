package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =( JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(500);
		//1.count of row
	
	int countRow= driver.findElements(By.cssSelector(".table-display tr")).size();
	System.out.println(countRow);
	//2.count no of column
	int countColumn=driver.findElements(By.cssSelector(".table-display th")).size();
	System.out.println(countColumn);
	//3. get the text of column no of 2
	String text=driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText();
	System.out.println(text);
	}

}
