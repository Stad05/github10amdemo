package day1basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getcommandex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		String expectedurl = "www.google.com";
		String actualurl = driver.getCurrentUrl();
		
		if(actualurl.equals(expectedurl))
		{
			System.out.println("URL match");
		}
		else
		{
			System.out.println("URL not match");
		}
		
	String s1 =	driver.getPageSource();
	System.out.println(s1);
		
	
/*	WebElement l = driver.findElement(By.linkText("Forgot your password?"));
		String tagname = l.getTagName();
		System.out.println("Tagname = "+tagname);
		
		String sizedemo = l.getCssValue("font-size");
		System.out.println("Font size = "+sizedemo);
		
		String atr = l.getAttribute("href");
		System.out.println("href = "+atr);
	} */
	
	
	WebElement btn = driver.findElement(By.id("visitUsTwo"));
	Dimension d = btn.getSize();
	
//	btn.submit();
	
	Boolean b1 = btn.isDisplayed();
	System.out.println("Displayed ? "+b1);
	
	Boolean b2 =btn.isEnabled();
	System.out.println("Enabled ? "+b2);
	
	int h = d.height;
	int w2 = d.width;
	System.out.println("height = "+h);
	System.out.println("width = "+w2);
	
	
	Point p1 = btn.getLocation();
	int x = p1.x;
	int y = p1.y;
	
	System.out.println("X = "+x);
	System.out.println("Y = "+y);
	
	// driver.get("https://www.amazon.in/");
	
/*	driver.navigate().to("https://www.google.com/");
	
	Thread.sleep(3000);
	
	driver.navigate().to("https://www.amazon.in/");
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	driver.navigate().forward();
	Thread.sleep(5000);
	
	driver.navigate().refresh(); */
	
	
	WebElement c = driver.findElement(By.id("chkboxOne"));
	c.click();
	
	Thread.sleep(3000);
	
	boolean b3 = c.isSelected();
	System.out.println("Selected ? "+b3);
	
	driver.quit();
	
	}
	

}
