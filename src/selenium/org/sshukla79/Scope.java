package selenium.org.sshukla79;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// count of link by tag a
int count= driver.findElements(By.tagName("a")).size();
System.out.println(count);
//footerdriver act as mini driver of driver
// limiting driver element
WebElement footerdriver =driver.findElement(By.id("gf-BIG"));
System.out.println(footerdriver.findElements(By.tagName("a")).size());
// limiting first column driver
WebElement firstcolumdriver=footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
System.out.println(firstcolumdriver.findElements(By.tagName("a")).size());

// check the link is working or not in column

for (int i =1;i<firstcolumdriver.findElements(By.tagName("a")).size();i++){
	
	//w.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a")));
String textclick=	Keys.chord(Keys.CONTROL,Keys.ENTER);
	firstcolumdriver.findElements(By.tagName("a")).get(i).sendKeys(textclick);
	//firstcolumdriver.getDomAttribute(null)
	Thread.sleep(5000L);

	
}

Set<String>windows=	driver.getWindowHandles();
Iterator<String>it=   windows.iterator();
while(it.hasNext()) {
	driver.switchTo().window( it.next());
System.out.println(	driver.getTitle());
	  
}


//System.out.println(footer);
	}

}
