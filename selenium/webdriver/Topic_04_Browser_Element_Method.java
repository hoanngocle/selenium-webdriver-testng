package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_04_Browser_Element_Method {
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
