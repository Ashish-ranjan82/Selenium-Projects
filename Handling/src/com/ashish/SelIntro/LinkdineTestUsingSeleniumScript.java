package com.ashish.SelIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v126.page.model.Screenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class LinkdineTestUsingSeleniumScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/in/ashish-ranjan-144901176/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashish829426@gmail.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pandey@123");

		driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
		driver.manage().deleteAllCookies();
		int a = 5;
		getScreenshot(driver);

	}

	public static void getScreenshot(WebDriver driver) throws IOException {
		driver.get("http://google.com");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("\"C:\\Users\\HP\\Desktop\\profile photo\\low kb.jpg\""));

	}
}
