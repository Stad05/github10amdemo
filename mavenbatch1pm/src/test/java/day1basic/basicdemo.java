package day1basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		String browser = "chrome";
		WebDriver driver = null;
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		String s = driver.getTitle();
		System.out.println(s);
		
		String expectedtitle = "Rahul Shetty Academy - Login page";
		
		if(expectedtitle.equalsIgnoreCase(s))
		{
			System.out.println("As expected");
		}
		else
			System.out.println("Title not matched");
		
		
		
		
		
		
	}

}
