package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Topic_04_Part_I {
    // Declare a variable representing Selenium WebDriver
    WebDriver driver;
    WebElement element;

    // Get project path
    String projectPath = System.getProperty("user.dir");

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver.exe");
        // Initialize browser
        driver = new FirefoxDriver();

        // Set waiting time to find element
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void TC01_Browser() {
        // function and method to interact with Browser throught driver
        /*
         * Action in Browser
         * - Open browser
         * - Open Url
         * - Refresh/ Back/ Forward
         * - Maximize/ Minimize/ Fullscreen
         * ...
         *
         * Get data from browser
         * Get Url, title, source page
         */

        // Close current tab
        driver.close();

        // Close all tab in browser
        driver.quit();

        // Find element -> return WebElement
        driver.findElement(By.id("email"));

        // Find all element -> return List
        driver.findElements(By.xpath("//x"));

        driver.getCurrentUrl();

        driver.findElement(By.id("submit")).click();

        WebElement emailTexbox = driver.findElement(By.id("email"));
        emailTexbox.clear();
        emailTexbox.sendKeys();
        emailTexbox.getAttribute("value");

        List<WebElement> links = driver.findElements(By.xpath("//a"));
        String homePageUrl = driver.getCurrentUrl();
        // Verify data
        Assert.assertEquals(homePageUrl , "google.com");

        // Get source code current page
        driver.getPageSource();
        Assert.assertTrue(driver.getPageSource().contains("Mail"));

        // Get Title
        driver.getTitle();

        // Get current Tab ID
        String tabID = driver.getWindowHandle();

        driver.manage().getCookies();

        driver.manage().logs();

        // Time cua viec find Element/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Time waiting page load
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        // Time waiting script load and success run
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        Point browserPosition = driver.manage().window().getPosition();

        driver.manage().window().setPosition(new Point(0, 250));

        Dimension browserSize = driver.manage().window().getSize();

        driver.manage().window().setSize(new Dimension(1366, 768));

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://google.com");

        driver.switchTo().alert();
        driver.switchTo().frame(1);
    }

    @Test
    public void TC02_Element() {
        // function and method to interact with Browser throught element

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    public void sleepInSeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
