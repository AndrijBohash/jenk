package com.sherish.tests;

import com.sherish.data.UserData;
import com.sherish.utils.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by AndriyBogash on 4/19/2015.
 */
public class BasicTestCase {

    protected  static WebDriver driver;
    public UserData user1=new UserData(ConfigProperties.getProperty("login.name"),ConfigProperties.getProperty("login.psw"));

    protected WebDriver getWebDriver(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);

        }
        return driver;
    }

    @AfterTest
    public  void tearDown() {
        driver.quit();
    }
}
