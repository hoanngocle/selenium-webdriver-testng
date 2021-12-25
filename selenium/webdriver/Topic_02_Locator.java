package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_02_Locator {
    // Declare a variable representing Selenium WebDriver
    WebDriver driver;
    // Get project path
    String projectPath = System.getProperty("user.dir");

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver.exe");
        // Initialize browser
        driver = new FirefoxDriver();

        // Set waiting time to find element
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Open facebook
//        driver.get("https://www.facebook.com");
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");
    }

    @Test
    public void TC01() {
        // ID
        driver.findElement(By.id("firstname")).sendKeys("nyx@gmail.com");
        sleepInSeconds(3);

        // Name
        driver.findElement(By.name("lastname")).sendKeys("123456");
        sleepInSeconds(3);

        // Class
        driver.findElement(By.className("name-middlename")).isDisplayed();
        driver.findElement(By.className("customer-name-middlename")).isDisplayed();

        // Tag name
        int inputNumber = driver.findElements(By.tagName("input")).size();
        System.out.println(inputNumber);
        sleepInSeconds(3);

        // LinkText
        driver.findElement(By.linkText("SEARCH TERMS")).click();
        sleepInSeconds(3);

        // Partial Linktext
        driver.findElement(By.partialLinkText("ADVANCED")).click();
        sleepInSeconds(3);

        // CSS
        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Nyx Darkness");
        sleepInSeconds(3);

        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Nyx Windy");
        sleepInSeconds(3);

        driver.findElement(By.cssSelector("#name")).sendKeys("Nyx Light");
        sleepInSeconds(3);

        // Xpath
        driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Iphone 15");
        sleepInSeconds(3);

        driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Iphone 99");
        sleepInSeconds(3);

        driver.findElement(By.xpath("//label[text()='Short Description']/following-sibling::div/input")).sendKeys("Emilia");
        sleepInSeconds(3);

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
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
