package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_025 {
    Navigation nv = new Navigation();
    @Then("Proper Breadcrumb, Page Heading, Page URL and Page Title should be displayed")
    public void properBreadcrumbPageHeadingPageURLAndPageTitleShouldBeDisplayed() {

        Assert.assertTrue(nv.getBrearCrumbs().isDisplayed());
        Assert.assertEquals(nv.getHeader().getText(),"Your Store");
        Assert.assertEquals(BasicDriver.getDriver().getCurrentUrl(),"https://opencart.abstracta.us/index.php?route=account/register");
        Assert.assertEquals(BasicDriver.getDriver().getTitle(),"Register Account");


    }
}
