package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Sakib on 7/12/2017.
 */
public class configuration {
    //Declaration and initialize WebDriver
    public static WebDriver driver=null;
    //This method is called by TestNG framework using @BeforeSuite annotation before running any case.
    // It will initialize the Firefox Webdriver.
    @BeforeSuite
    public void setup(){

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        driver= new FirefoxDriver();
    }
    //Close driver after finishing the test execution
    @AfterSuite
    public void driverQuite(){
        driver.quit();
    }
}
