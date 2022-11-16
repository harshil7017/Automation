package BasePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
		
		WebDriver driver;
		public static void Setup()
		{
				WebDriver driver=new ChromeDriver();
				//open a Chrome browser
				driver.get("https://www.justdial.com/");
				driver.manage().window().maximize();
		}
		
	}
		
		



