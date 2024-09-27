package selenium.org.sshukla79;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrokerLinks {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//String url=	driver.findElement(By.partialLinkText("a")).getAttribute("href");
	//String url =driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		List<WebElement>link= driver.findElements(By.cssSelector("li"));
		//System.out.println(urls.g);
	for(int i=0; i<link.size();i++) {
	String links=	  link.get(i).getAttribute("href");
	HttpsURLConnection conn=(HttpsURLConnection)new URL(links).openConnection();	
	//System.out.println(conn);
    conn.setRequestMethod("HEAD");
	conn.connect();
	int status=conn.getResponseCode();
	System.out.println(status);
	if(status>400) {
		System.out.println("BROKEN LINK");
	}
	
else {
	System.out.println(" UNBROKEN LINK");
	}
	
	 
	 
	}
//			HttpsURLConnection conn=(HttpsURLConnection) new URL(urls.get(i).getText()).openConnection();
//			System.out.println(conn);
//		conn.setRequestMethod("HEAD");
//			conn.connect();
//		}
//			
//	System.out.println(url);
//HttpsURLConnection conn=(HttpsURLConnection) new URL(url).openConnection();
//conn.setRequestMethod("HEAD");
//conn.connect();
//int status=conn.getResponseCode();
//System.out.println(status);

//	//
	}

}
