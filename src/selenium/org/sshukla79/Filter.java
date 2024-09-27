package selenium.org.sshukla79;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/OneDrive/Documents/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
      driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
      driver.findElement(By.id("search-field")).sendKeys("Rice");

      List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));

      //1 results

     List<String> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).map(veggie -> getPrice(veggie)).

      collect(Collectors.toList());
filteredList.forEach(System.out::println);
     //1 result

   //  Assert.assertEquals(veggies.size(), filteredList.size());
     File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file, new File("C:\\Users\\shiva\\Pictures\\Saved Pictures\\screenshot.png"));
     

     

     
		

	}

	private static String getPrice(WebElement veggie) {
		// TODO Auto-generated method stub
		return veggie.findElement(By.xpath("following-sibling::td[1]")).getText();
	}

}
