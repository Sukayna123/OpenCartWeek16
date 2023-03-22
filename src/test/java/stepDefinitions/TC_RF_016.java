package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_016 extends BasicDriver {

    Navigation nv = new Navigation();

    @Given("Navigate to opencart")
    public void navigateToOpencart() {
        getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @When("Click on My Account")
    public void clickOnMyAccount() {
        nv.clickMethod(nv.getMyAccount());
    }

    @And("Click on register option")
    public void clickOnRegisterOption() {
        nv.clickMethod(nv.getRegister());
    }

    @And("Enter space into mandatory fields")
    public void enterSpaceIntoMandatoryFields() {
        nv.sendKeysMethod(nv.getFirstName(), " ");
        nv.sendKeysMethod(nv.getLastName(), " ");
        nv.sendKeysMethod(nv.getEmail(), " ");
        nv.sendKeysMethod(nv.getTelephone(), "    ");
        nv.sendKeysMethod(nv.getPassword(),"    ");
        nv.sendKeysMethod(nv.getPasswordConfirm(),"    ");
        nv.clickMethod(nv.getSubscribeYes());
        nv.clickMethod(nv.getPrivacyPolicy());

    }

    @Then("click on Continue button")
    public void clickOnContinueButton() {
        nv.clickMethod(nv.getContinueButton());
    }

    @Then("User should see warning message for these mandatory fields")
    public void userShouldSeeWarningMessageForTheseMandatoryFields() {
        Assert.assertTrue(nv.getFirstNameNotValidMessage().isDisplayed());
        Assert.assertTrue(nv.getLastNameNotValidMessage().isDisplayed());
        Assert.assertTrue(nv.getEmailAddressNotValidMessage().isDisplayed());
        Assert.assertFalse(nv.getTelephone().getText().contains("Telephone must be between 3 and 32 characters!"));
        Assert.assertFalse(nv.getPassword().getText().contains("Password must be between 4 and 20 characters!"));
        Assert.assertFalse(nv.getPasswordConfirm().getText().contains("Password confirmation does not match password!"));


    }
}
