package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Navigation;

public class TC_RF_005 {

    Navigation navigation=new Navigation();
    @And("Enter new Account Details into all the Fields First Name Last Name EMail Telephone Password Password Confirm and Privacy Policy Fields")
    public void enterNewAccountDetailsIntoAllTheFieldsFirstNameLastNameEMailTelephonePasswordPasswordConfirmAndPrivacyPolicyFields() {
        navigation.sendKeysMethod(navigation.getFirstName(),"Jenn");
        navigation.sendKeysMethod(navigation.getLastName(),"Fall");
        navigation.sendKeysMethod(navigation.getEmail(),"jennfall@gmail.com");
        navigation.sendKeysMethod(navigation.getTelephone(),"1234567890");
        navigation.sendKeysMethod(navigation.getPassword(),"jennF");
        navigation.sendKeysMethod(navigation.getPasswordConfirm(),"jennF");
        navigation.clickMethod(navigation.getPrivacyPolicy());

    }

    @And("Click on Yes radio option for Newsletter")
    public void clickOnYesRadioOptionForNewsletter() {
        navigation.clickMethod(navigation.getSubscribeYes());
    }

    @And("Click on Continue button that is displayed in the Account Success page")
    public void clickOnContinueButtonThatIsDisplayedInTheAccountSuccessPage() {
        navigation.clickMethod(navigation.getContinueButtonSecondPage());
    }

    @Then("Click on Subscribe Unsubscribe to newsletter option")
    public void clickOnSubscribeUnsubscribeToNewsletterOption() {
        navigation.clickMethod(navigation.getNewsletterForSubscriptionThirdPage());
        Assert.assertTrue(navigation.isPresent(navigation.getNewslettersSecondYesButton()));
    }
}
