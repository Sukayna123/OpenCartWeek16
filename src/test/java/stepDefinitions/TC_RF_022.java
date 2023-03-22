package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_022 extends BasicDriver {
    Navigation nv = new Navigation();
    @Given("Navigate opencart")
    public void navigateOpencart() {
        getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @When("Click on my account")
    public void clickOnMyAccount() {
        nv.clickMethod(nv.getMyAccount());
    }

    @And("Click on Register Option")
    public void clickOnRegisterOption() {
        nv.clickMethod(nv.getRegister());
    }

    @Then("View the Privacy Policy checkbox option")
    public void viewThePrivacyPolicyCheckboxOption() {
        // Verify that the checkbox is not selected by default
        Assert.assertFalse(nv.getPrivacyPolicy().isSelected());
    }
}
