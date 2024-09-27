package selenium.org.sshukla79;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Above {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
      driver.get("https://rahulshettyacademy.com/angularpractice/");
   WebElement textbox=  driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']"));
   WebElement textbox1=  driver.findElement(By.xpath("//label[normalize-space()='Gender']"));

    WebElement text2=driver.findElement(By.cssSelector("#inlineRadio1")); 
    System.out.println( driver.findElement(with(By.tagName("label")).above(textbox)).getText());
    System.out.println( driver.findElement(with(By.tagName("select")).below(textbox1)).getText());  
    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(text2)).getText());
	}

}
