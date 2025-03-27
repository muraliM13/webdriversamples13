package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsTest {
  @Test
  public void mouseActions() throws InterruptedException {
  	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().maximize();// to minimize the opened window in browser
	Actions actions = new Actions(driver);
	driver.get("https://testautomationpractice.blogspot.com/");
	WebElement txtField = driver.findElement(By.id("field2"));
	actions.scrollToElement(txtField).perform();
	WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
	actions.moveToElement(btn).perform();
	WebElement item2 = driver.findElement(By.linkText("Laptops"));
	Thread.sleep(5000);
	actions.click(item2).perform();
	WebElement btnDbl = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
	actions.doubleClick(btnDbl).perform();
	Thread.sleep(5000);
	actions.contextClick(txtField).perform();
	
	
	
  
  }
}
