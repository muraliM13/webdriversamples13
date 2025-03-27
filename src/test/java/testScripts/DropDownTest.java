package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest {
  @Test
  public void selectValue() {
	  
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().maximize();// to minimize the opened window in browser
	  driver.get("https://testautomationpractice.blogspot.com/");
	  Select sel = new Select(driver.findElement(By.id("country")));
	  sel.selectByIndex(9);
	  //sel.selectByValue("uk");
	 // sel.selectByVisibleText("United Kingdom");
	  Select muSel = new Select(driver.findElement(By.id("colors")));
	  if(muSel.isMultiple()) {
		  sel.selectByIndex(0);
		  sel.selectByValue("green");
		  sel.selectByVisibleText("Red");
		  	  
		  List<WebElement> items= muSel.getAllSelectedOptions();
		  System.out.println(items.size());
		//  muSel.deselectByValue("green");
	  }
	  
  }
}
