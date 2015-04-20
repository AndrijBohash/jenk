package com.sherish.pages;

import com.sherish.data.UserData;
import com.sherish.utils.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by AndriyBogash on 4/19/2015.
 */
public class LoginPage extends Page{
     @FindBy(id="email")
     public WebElement loginField;

     @FindBy (id = "password")
     public WebElement pswField;

     @FindBy (name = "commit")
     public WebElement signInBtn;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public TimelinePage loginAs(UserData user){
        type(loginField,ConfigProperties.getProperty("login.name"));
        type(pswField,ConfigProperties.getProperty("login.psw"));
        signInBtn.click();
        return PageFactory.initElements(driver,TimelinePage.class);
    }
    @Override
    public void open() {
        driver.get(ConfigProperties.getProperty("login.url"));

    }
}
