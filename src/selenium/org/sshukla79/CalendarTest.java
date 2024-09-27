package selenium.org.sshukla79;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String monthNumber="6";
		String day="15";
		String year="2027";
		String[] exceptedResult= {monthNumber,day,year};
		String dateres = "";
		
		String date = String.format("%s/%s/%s",monthNumber,day,year);
		System.out.println(date);
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon.react-date-picker__button__icon")).click();
		Thread.sleep(3000);
//	driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).sendKeys("06/15/2027");
		//driver.findElement(By.xpath("//button[@class='react-date-picker__clear-button react-date-picker__button']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//input[@placeholder='----']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='"+year+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("abbr[aria-label='June "+year+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("abbr[aria-label='"+day+" June "+year+"']")).click();
		Thread.sleep(2000);
   List<WebElement>dateList	=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
   for(int i=0;i<dateList.size();i++) {
	   System.out.println( dateList.get(i).getAttribute("value"));
	   if(i>0) {
		   dateres+="/" ;
		   
	   }
	   dateres+=dateList.get(i).getAttribute("value");;
	   Assert.assertEquals(dateList.get(i).getAttribute("value"),exceptedResult[i] );
	 
   }
   System.out.println(dateres);
   Assert.assertEquals(dateres, date);
		

  
	}
	

}
