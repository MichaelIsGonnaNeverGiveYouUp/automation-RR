package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;
import singleton.SingletonBaseClass;

public class HomePageTest {
    @BeforeTest
    public void init() {
        SingletonBaseClass.init();
    }

    @AfterTest
    public void quit() {
        SingletonBaseClass.quit();
    }
    @Test
    public void verifyTitle() {
        /*
        * This test will verify the title of the home page
        * It will fail since the title is incorrect: Current title is "Randall Reilly | Growth platform for vital industries."
         */
        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.getTitle(), "Randall Reilly");
    }
}
