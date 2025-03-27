package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioChkBoxTest {
  @Test
  public void selectRadioTest() throws InterruptedException {
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().minimize();// to minimize the opened window in browser
	  /*driver.get("https://the-internet.herokuapp.com/checkboxes");
	  driver.findElement(By.xpath("(//input[@types='checkbox'])(1)")).click();
	  //Thread.sleep(5000);
	  boolean isSel = driver.findElement(By.xpath("(//input[@types='checkbox'])(2)")).isSelected();
	  if(isSel) {
		  driver.findElement(By.xpath("(//input[@types='checkbox'])(2)")).click();
	  }*/
	 // Thread.sleep(5000);
	  //For radio button
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.findElement(By.id("male")).click();
	 
	 
  }
}
