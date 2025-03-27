package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicElementLocation {
	String expItem = "Iphone 6 32gb";
  @Test
  public void DynamicElement() throws InterruptedException {
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().minimize();// to minimize the opened window in browser
	  driver.get("https://demoblaze.com/");
	 // List<WebElement> items = driver.findElement(By.cssSelector("h4.card-test");
	  List<WebElement> items= driver.findElements(By.cssSelector("h4.card-test"));
	  Thread.sleep(5000);
	  
	  for(WebElement item : items) {
		  System.out.println(item);
		  if(item.getText().equalsIgnoreCase(expItem)){
			  item.click();
			  break;  
		  }
		  
	  }
	  
  }
}
