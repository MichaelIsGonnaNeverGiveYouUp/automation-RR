package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.TopBannerPage;
import singleton.SingletonBaseClass;

public class TopBannerPageTest {
    @BeforeTest
    public void init() {
        SingletonBaseClass.init();
    }

    @AfterTest
    public void quit() {
        SingletonBaseClass.quit();
    }

    @Test
    public void visitTalentIntelligenceOptions() {
        /*
        * This test will visit each of the Talent Intelligence options and verify the URL
        * We could use parametrization to make this test more efficient, but this way will do it sequentially
        * Also, we could get all the menu options in a list, but doing that might lead to some bugs
         */
        TopBannerPage topBannerPage = new TopBannerPage();
        topBannerPage.talentIntelligenceMenu.hover();
        topBannerPage.talentIntelligenceMenuOverview.click();
        Assert.assertEquals(SingletonBaseClass.getDriver().getCurrentUrl(), topBannerPage.talentIntelligenceMenuOptions.get("overview"));
        topBannerPage.talentIntelligenceMenu.hover();
        topBannerPage.talentIntelligenceMenuTechnologies.click();
        Assert.assertEquals(SingletonBaseClass.getDriver().getCurrentUrl(), topBannerPage.talentIntelligenceMenuOptions.get("technologies"));
        topBannerPage.talentIntelligenceMenu.hover();
        topBannerPage.talentIntelligenceMenuTalentPartners.click();
        Assert.assertEquals(SingletonBaseClass.getDriver().getCurrentUrl(), topBannerPage.talentIntelligenceMenuOptions.get("talentPartners"));
        topBannerPage.talentIntelligenceMenu.hover();
        topBannerPage.talentIntelligenceMenuStrategicResults.click();
        Assert.assertEquals(SingletonBaseClass.getDriver().getCurrentUrl(), topBannerPage.talentIntelligenceMenuOptions.get("strategicResults"));
        topBannerPage.talentIntelligenceMenu.hover();
        topBannerPage.talentIntelligenceMenuQualityApplicants.click();
        Assert.assertEquals(SingletonBaseClass.getDriver().getCurrentUrl(), topBannerPage.talentIntelligenceMenuOptions.get("qualityApplicants"));
    }

}
