package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;

    public BaseTest() {
        this.driver = DriverFactory.getDriver();
    }

    @BeforeTest
    public void setup() {
        driver.get("https://qaplayground.dev/apps/dynamic-table/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
