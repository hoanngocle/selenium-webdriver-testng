package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_03_XPath_CSS {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void TC01() {
        driver.get("http://live.techpanda.org/index.php");
        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Sony Xperia')]")).click();
        driver.findElement(By.xpath("//input[starts-with(@id, 'coupon')]")).click();
        driver.findElement(By.xpath("//input[starts-with(@data-spm-anchor-id, 'a2o4n.login_signup')]")).click();
    }

    @Test
    public void TC02() {

    }

    @AfterClass
    public void afterClass() {
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
