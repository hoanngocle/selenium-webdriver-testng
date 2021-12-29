package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_04_Run_On_Multiple_Browser {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    @Test
    public void TC01_Chrome() {

    }

    @Test
    public void TC02_Firefox() {
        System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.quit();
    }

    @Test
    public void TC03_Edge() {

    }

    public void sleepInSeconds(long seconds) {
        try {
            Thread.sleep(seconds * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
