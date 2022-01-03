package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Topic_04_Run_On_Multiple_Browser {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    @Test
    public void TC01_Chrome() {
        // Executable File: chromedriver/ geckodriver/ edge driver...
        System.setProperty("webdriver.chrome.driver", projectPath + "/browserDrivers/chromedriver.exe");

        // Class: FirefoxDriver/ ChromeDriver/ EdgeDriver
        driver = new ChromeDriver();

        // Open url
        driver.get("https://www.facebook.com/");

        driver.quit();
    }

    @Test
    public void TC02_Firefox() {
        // Executable File: chromedriver/ geckodriver/ edge driver...
        System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver.exe");

        // Class: FirefoxDriver/ ChromeDriver/ EdgeDriver
        driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");

        driver.quit();
    }

    @Test
    public void TC03_Edge() {
        // Executable File: chromedriver/ geckodriver/ edge driver...
        System.setProperty("webdriver.edge.driver", projectPath + "/browserDrivers/edgedriver.exe");

        // Class: FirefoxDriver/ ChromeDriver/ EdgeDriver
        driver = new EdgeDriver();

        driver.get("https://www.facebook.com/");

        driver.quit();

    }

    public void sleepInSeconds(long seconds) {
        try {
            Thread.sleep(seconds * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
