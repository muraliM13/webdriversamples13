package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableTest {
  @Test
  public void dynamicWebElement() {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(), 'Master In Selenium')]//following-sibling::td"));
		System.out.println("details of a book..");
		for(WebElement item:items) {
			System.out.println(item.getText());
		}
		List<WebElement> price = driver.findElements(By.xpath("//td[contains(text(), '2000')]//folowing-sibling::td[3]"));
		System.out.println("details of a book..");
		for(WebElement p:price) {
			System.out.println(p.getText());
		}
		List<WebElement> cost = driver.findElements(By.xpath("//td[contains(text(), '3000')]//preceding-sibling::td[3]"));
		System.out.println("details of a book..");
		for(WebElement c:cost) {
			System.out.println(c.getText());
		}
		
		
		
	}
  
  
  
}

