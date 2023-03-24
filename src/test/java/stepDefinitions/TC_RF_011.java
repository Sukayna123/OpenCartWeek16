package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_011 extends BasicDriver{

    Navigation def = new Navigation();
    @Given("I am on the homepage")
    public void ıAmOnTheHomepage() {
        getDriver().get("https://opencart.abstracta.us/");
        getDriver().manage().window().maximize();
    }

    @When("I click on My Account drop menu")
    public void ıClickOnMyAccountDropMenu() {
        def.clickMethod(def.getMyAccount());
    }

//    @And("I click on Register option")
//    public void iClickOnRegisterOption() {
//        def.clickMethod(def.getRegister());
//    }

    @And("I enter new Account Details into all the Fields")
    public void ıEnterNewAccountDetailsIntoAllTheFields() {
        def.sendKeysMethod(def.getFirstName(),"Kamil");
        def.sendKeysMethod(def.getLastName(),"Grosicki");
        def.sendKeysMethod(def.getEmail(),"kamil_grosicki_10_10_10_10_@gmail.com");
        def.sendKeysMethod(def.getPassword(),"10101010");
        def.sendKeysMethod(def.getPasswordConfirm(),"10101010");
        def.clickMethod(def.getSubscribeYes());
        def.clickMethod(def.getPrivacyPolicy());
    }

    @And("I enter invalid phone number into the Telephone Field as abcde")
    public void ıEnterInvalidPhoneNumberIntoTheTelephoneField() {
        def.sendKeysMethod(def.getTelephone()," ");
    }

    @And("I click on Continue button")
    public void ıClickOnContinueButton() {
        def.clickMethod(def.getContinueButton());
    }

    @Then("I should see an error message for the invalid phone number")
    public void ıSouldSheeAnErrorMessageForTheInvalidPhoneNumber() {
       // def.clickMethod(def.getContinueButtonSecondPage());

        Assert.assertTrue(def.getPhoneNumberNotValidMessage().getText().contains("Telephone must be between 3 and 32 characters!"));

       // Assert.assertTrue(def.getPhoneNumberNotValidMessage().getText().equals("Telephone must be between 3 and 32 characters!"));
    }
}
