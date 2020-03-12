package org.kav.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\eclipse\\Sample\\Kanagaraj\\SeleCount\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement x : links) {
			String attribute = x.getAttribute("href");
			int count = 0;
			List<WebElement> link = driver.findElements(By.tagName("a"));
			System.out.println(link.size());
			

	}

}
}
