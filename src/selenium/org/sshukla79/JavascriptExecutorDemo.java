package selenium.org.sshukla79;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =( JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,700)");
		Thread.sleep(500);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		int sum =0;
		
List<WebElement>value=		driver.findElements(By.cssSelector(".tableFixHead  td:nth-child(4)"));
for(int i =0; i<value.size();i++) {
	
	//System.out.println(value.get(i).getText());
	String s =value.get(i).getText();
	sum = sum+ Integer.parseInt(s);
	
	
}
String text=driver.findElement(By.xpath("//div[.=' Total Amount Collected: 296 ']")).getText();
System.out.println("Total Amount Collected: "+sum+"");
//Assert.assertEquals(text,"Total Amount Collected:" +sum+" ");
if(text.contains("Total Amount Collected: "+sum+"")) {
	System.out.println("PASS");
}

else {
	System.out.println("FAIL");
}

	}
//	.table-display td:nth-child(2)
//	.table-display  tbody th:nth-child(2) 
//
//	//.table-display tr:nth-child(3)
//	//.table-display tr
//	//.table-display tr:nth-child(1)
}
