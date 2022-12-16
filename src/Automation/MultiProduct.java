package Automation;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemNeeded= {"Cauliflower","Pista"};		
		driver.manage().window().maximize();
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List itemlist=Arrays.asList(itemNeeded);
			System.out.println(formattedName);
	
			if(itemlist.contains(formattedName))
			{
			
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
			}
			
		}

	}

}
