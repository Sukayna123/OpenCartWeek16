package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Navigation;

public class TC_RF_009 {

    Navigation navigation=new Navigation();
    @And("Enter existing Account Details into all the Fields \\(First Name,Last Name,etc)")
    public void enterExistingAccountDetailsIntoAllTheFieldsFirstNameLastNameEtc() {
        navigation.sendKeysMethod(navigation.getFirstName(),"Pavan");
        navigation.sendKeysMethod(navigation.getLastName(),"B");
        navigation.sendKeysMethod(navigation.getEmail(),"pavanoltraining@gmail.com");
        navigation.sendKeysMethod(navigation.getTelephone(),"814240XXXX");
        navigation.sendKeysMethod(navigation.getPassword(),"12345");
        navigation.sendKeysMethod(navigation.getPasswordConfirm(),"12345");
        navigation.clickMethod(navigation.getSubscribeYes());
        navigation.clickMethod(navigation.getPrivacyPolicy());
    }

    @Then("click on continue button again")
    public void clickOnContinueButtonAgain() {

        navigation.clickMethod(navigation.getContinueButton());
        Assert.assertTrue(navigation.getWarningMessageForRegisteredAccount().isDisplayed());
        navigation.getWarningMessageForRegisteredAccount().getText();
    }
}
