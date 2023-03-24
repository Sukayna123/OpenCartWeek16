package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;

public class TC_RF_017 {

    Navigation navigation=new Navigation();
    @And("Enter new Account Details into all fields")
    public void enterNewAccountDetailsIntoAllFields() {
        navigation.sendKeysMethod(navigation.getFirstName(),"John" );
        navigation.sendKeysMethod(navigation.getLastName(),"Doe");
        navigation.sendKeysMethod(navigation.getEmail(),"johndoe11@gmail.com");
        navigation.sendKeysMethod(navigation.getTelephone(),"132424233");


    }



    @When("Enter simple password as {string}")
    public void enterSimplePasswordAs(String arg0) {
        navigation.sendKeysMethod(navigation.getPassword(),arg0);
        navigation.sendKeysMethod(navigation.getPasswordConfirm(),arg0);
        navigation.clickMethod(navigation.getPrivacyPolicy());
    }

    @Then("Warning message should displayed for fallowing password Complexity Standards")
    public void warningMessageShouldDisplayedForFallowingPasswordComplexityStandards() {
        Assert.assertTrue(navigation.getCongratulationsMessage().getText().equals("Password must be between 4 and 20 characters!"));
    }
}
