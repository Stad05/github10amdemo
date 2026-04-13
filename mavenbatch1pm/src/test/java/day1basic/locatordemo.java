package day1basic;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatordemo {
	
	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
//	driver.findElement(By.id("inputUsername")).sendKeys("stad");
	
	// css using id
	
//	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("stad");

	// css using random attribute name
	
	//  Tagname[attributename=’Value’]
	
	// input[placeholder='Username']
	
//	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("stad");
	
	// xpath
	//  //tagname[@attributename=’value’]
	
	//input[@placeholder='Username']
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("stad");
	
	WebElement pwd = driver.findElement(By.name("inputPassword"));
	
	pwd.sendKeys("1234");
	
	Thread.sleep(4000);
	
	pwd.clear();
	
	
	
	//driver.findElement(By.className("signInBtn")).click();
	
	// css using class name
	
//	driver.findElement(By.cssSelector(".signInBtn")).click();
	
	
	
	
	
//	driver.findElement(By.linkText("Forgot your password?")).click();
	
	/*driver.findElement(By.partialLinkText("Forgot")).click();
	
	Thread.sleep(3000);
	
	WebElement w = driver.findElement(By.tagName("p"));
	
String s = 	w.getText();

System.out.println(s); */
	
List<WebElement> list = driver.findElements(By.tagName("a"));

for(WebElement w : list)
{
	System.out.println(w.getText());
}


   



	
	
	
	
	
	
}

}