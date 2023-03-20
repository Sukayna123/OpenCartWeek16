package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.POM_RegisterElements;
import utility.BasicDriver;

public class TC_RF_008 extends BasicDriver {
    POM_RegisterElements pom=new POM_RegisterElements();
    @When("Navigate to OpenCart")
    public void navigateToOpenCart() {
        getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @Then("Click on My Account Drop menu")
    public void clickOnMyAccountDropMenu() {
        pom.clickMethod(pom.getMyAccount());
    }

    @Then("Click on Register option")
    public void clickOnRegisterOption() {
        pom.clickMethod(pom.getRegister());
    }

    @Then("Enter new Account Details into the all Fields without password")
    public void enterNewAccountDetailsIntoTheAllFieldsWithoutPassword() {
        pom.sendKeysMethod(pom.getRegisterFirstName(),"Ali");
        pom.sendKeysMethod(pom.getRegisterLastName(),"Ozgun");
        pom.sendKeysMethod(pom.getRegisterEmail(),"valiozgun4@hotmail.com");
        pom.sendKeysMethod(pom.getRegisterTelephone(),"0345623");
        pom.clickMethod(pom.getRegisterCheckbox());
        pom.clickMethod(pom.getSubscribeYesButton());
    }

    @And("Enter not matching password and confirm password")
    public void enterNotMatchingPasswordAndConfirmPassword() {
        pom.sendKeysMethod(pom.getRegisterPassword(),"12345");
        pom.sendKeysMethod(pom.getRegisterConfirmPassword(),"abcde");
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        pom.clickMethod(pom.getRegisterContinueButton());
    }

    @Then("User should see Password confirmation does not match password! message under Password Confirm field")
    public void userShouldSeePasswordConfirmationDoesNotMatchPasswordMessageUnderPasswordConfirmField() {
        Assert.assertTrue(pom.getPasswordNotMuchMessage().isDisplayed());
    }
}
