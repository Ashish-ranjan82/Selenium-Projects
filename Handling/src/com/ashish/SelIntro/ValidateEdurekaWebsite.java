package com.ashish.SelIntro;

import java.time.Duration;
//import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ValidateEdurekaWebsite {
    static WebDriver driver;
    
    @Test(priority = 0)
    public void EdurekaProfile() {
        // Set up WebDriver
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java-edureka\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Launch Edureka website
        driver.get("https://www.edureka.co/");
        System.out.println("Navigated to Edureka homepage.");

        // Log in process
        driver.findElement(By.linkText("Log In")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("si_popup_email")));
        actions.moveToElement(driver.findElement(By.id("si_popup_email"))).click().sendKeys("TestingEdureka@gmail.com").perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("si_popup_passwd")));
        actions.moveToElement(driver.findElement(By.id("si_popup_passwd"))).click().sendKeys("12345678").perform();

        // Click on the login button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='clik_btn_log btn-block']"))).click();

        // Navigate to the profile section
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[contains(text(),'My Profile')]"))).click();

        // Wait for profile page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(),'My Profile')]"))).click();

        // Edit profile details
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='personal-details']//i[@class='icon-pr-edit']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name']"))).clear();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Edureka");

        // Navigate to the career interests page
        driver.navigate().to("https://learning.edureka.co/onboarding/careerinterests");
        System.out.println("Navigated to career interests page.");

        // Select job preferences
        Select dropdownCurrentJob = new Select(driver.findElement(By.xpath("//select[@name='interestedJob']")));
        dropdownCurrentJob.selectByVisibleText("Software Testing");

        Select dropdownEmployementType = new Select(driver.findElement(By.xpath("//select[@name='elementType']")));
        dropdownEmployementType.selectByVisibleText("Both");

        Select dropdownCTC = new Select(driver.findElement(By.xpath("//select[@name='lastDrawnSalary']")));
        dropdownCTC.selectByVisibleText("Not applicable");

        // Select city and submit
        driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
        driver.findElement(By.name("preferredCity")).sendKeys("Mumbai");

        // Submit the form
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Career interests updated.");

        // Log out process
        driver.navigate().to("https://learning.edureka.co/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='user_name']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Log Out')]"))).click();
        System.out.println("Logged out successfully.");
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Browser closed.");
    }
}

