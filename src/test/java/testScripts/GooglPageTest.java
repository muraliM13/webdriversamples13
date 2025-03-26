package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GooglPageTest {
  @Test
  public void googleSearch() {
	  
	  
	  ChromeOptions options = new ChromeOptions();
	 // options.setBrowserVersion("120");
	 // WebDriver driver  = new ChromeDriver(options);
//	  WebDriver driver  = new EdgeDriver();
	  WebDriver driver  = new ChromeDriver();
	  //driver.manage().window().maximize(); //to maximize the opened window in browser
	  driver.manage().window().minimize();// to minimize the opened window in browser
	  driver.get("https://the-internet.herokuapp.com/login");
//	   
//	  WebElement name= driver.findElement(By.id("username"));//withouth the xpath
//	  WebElement name = driver.findElement(By.xpath("//input[@type='text' and @name='username']"));//with the xpath
//	  name.sendKeys("tomsmith");
////    WebElement pwd= driver.findElement(By.name("password"));
//	  WebElement pwd = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));//with the xpathv
//	  pwd.sendKeys("SuperSecretPassword!");
////	  WebElement btnLogin = driver.findElement(By.className("radius"));
//	  WebElement btnLogin = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));// with the xpath for this need to inspect the page and check for the subclass name with i class;'.....' and copy that with [] @ before the class
//	  btnLogin.click();
//	  
//	  driver.navigate().back();
//	  System.out.println(driver.getTitle());
//	  System.out.println(driver.getCurrentUrl());
//	  driver.navigate().forward();
//	  System.out.println(driver.getCurrentUrl());
	  
	  
//	  driver.findElement(By.linkText("Elemental Selenium")).click();// to search complete site keyword
//	driver.findElement(By.partialLinkText("Elemental")).click();// to check with existing single keyword
	  
//	  driver.get("https://account.lambdatest.com/register");
//	  WebElement name = driver.findElement(By.xpath("//input[@type='text' and @name='username']"));//with the xpath
//	  name.sendKeys("tomsmith");
//    WebElement pwd= driver.findElement(By.name("password"));
//	  WebElement pwd = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));//with the xpathv
//	  pwd.sendKeys("SuperSecretPassword!");
//	  WebElement btnLogin = driver.findElement(By.className("radius"));
//	  WebElement btnLogin = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));// with the xpath for this need to inspect the page and check for the subclass name with i class;'.....' and copy that with [] @ before the class
//	  btnLogin.click();
	  
	  
	  // cssSelector
	  
	  WebElement name= driver.findElement(By.cssSelector("input#username"));
	  name.sendKeys("tomsmith");
	  WebElement pwd= driver.findElement(By.name("password"));	
	  pwd.sendKeys("SuperSecretPassword!");
	 // WebElement btnLogin = driver.findElement(By.className(".radius"));
	  WebElement btnLogin = driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in"));// with the xpath for this need to inspect the page and check for the subclass name with i class;'.....' and copy that with [] @ before the class
	  btnLogin.click();
	  
	  
  }

private Object linkText() {
	// TODO Auto-generated method stub
	return null;
}

private Object linktext() {
	// TODO Auto-generated method stub
	return null;
}
}
