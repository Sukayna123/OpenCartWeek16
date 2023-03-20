package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_008 extends BasicDriver {
    Navigation nv=new Navigation();
    @When("Navigate to OpenCart")
    public void navigateToOpenCart() {
        getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @Then("Click on My Account Drop menu")
    public void clickOnMyAccountDropMenu() {
        nv.clickMethod(nv.getMyAccount());
    }

    @Then("Click on Register option")
    public void clickOnRegisterOption() {
        nv.clickMethod(nv.getRegister());

    }

    @Then("Enter new Account Details into the all Fields without password")
    public void enterNewAccountDetailsIntoTheAllFieldsWithoutPassword() {
        nv.sendKeysMethod(nv.getFirstName(),"Paw");
        nv.sendKeysMethod(nv.getLastName(),"Petrol");
        nv.sendKeysMethod(nv.getEmail(),"pawpetrol45@hotmail.com");
        nv.sendKeysMethod(nv.getTelephone(),"0345623");
        nv.clickMethod(nv.getPrivacyPolicy());
        nv.clickMethod(nv.getSubscribeYes());
    }

    @And("Enter not matching password and confirm password")
    public void enterNotMatchingPasswordAndConfirmPassword() {
        nv.sendKeysMethod(nv.getPassword(),"12345");
        nv.sendKeysMethod(nv.getPasswordConfirm(),"abcde");
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        nv.clickMethod(nv.getContinueButton());
    }

    @Then("User should see Password confirmation does not match password! message under Password Confirm field")
    public void userShouldSeePasswordConfirmationDoesNotMatchPasswordMessageUnderPasswordConfirmField() {
        Assert.assertTrue(nv.getPasswordNotMatchMessage().isDisplayed());
    }
}
