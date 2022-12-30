package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BadSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
	}

}
