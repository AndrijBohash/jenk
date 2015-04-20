package com.sherish.tests;

import com.sherish.pages.LoginPage;
import com.sherish.pages.TimelinePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends BasicTestCase{

    private boolean acceptNextAlert = true;
    private LoginPage loginPage= PageFactory.initElements(getWebDriver(),LoginPage.class);

    private TimelinePage timelinePage;
    @Test
    public void testUntitled() throws Exception {
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]

        loginPage.open();

        timelinePage=loginPage.loginAs(user1);

    }




}
