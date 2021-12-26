package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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

        // Start-with
        driver.findElement(By.xpath("//input[starts-with(@id, 'coupon')]")).click();
        driver.findElement(By.xpath("//input[starts-with(@data-spm-anchor-id, 'a2o4n.login_signup')]")).click();
    }

    @Test
    public void TC02() {
        driver.get("https://automationfc.github.io/basic-form/");

        // text()='...' || not using with nested text and child text
        driver.findElement(By.xpath("//h1[text()='SELENIUM WEBDRIVER API']"));

        // contains(text(), '...') ||
        driver.findElement(By.xpath("//h1[contains(text(),'SELENIUM WEBDRIVER API')]"));

        // contains(., '...') || contains(string(), '...') find everything, slow performance
        driver.findElement(By.xpath("//h1[contains(text(),'SELENIUM WEBDRIVER API')]"));

        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(string(), 'Nyx)]")).getText(), "Nyx");

//        driver.findElement(By.xpath("//span[text()=concat('Hello \"John\", What', "'s happened?")]"));
        // and || or
        driver.findElement(By.xpath("//h1[@id='email' and @name='email']"));
        driver.findElement(By.xpath("//h1[@id='email' or @id='password']"));

        // position() = absolute value
        driver.findElement(By.xpath("//li[7]"));
        driver.findElement(By.xpath("//li[position()=7]"));

        // last() || first = 1
        driver.findElement(By.xpath("//li[last()]"));
        driver.findElement(By.xpath("//li[1]"));

        // surround if not in 1 parent node

        // start-with

        // following-sibling
        driver.findElement(By.xpath("//td[contains(text(), '678')]/following-sibling::td/button[@class='edit']"));
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
