package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Navigation;

public class TC_RF_004 {
    Navigation nv=new Navigation();
    @Then("User should see warning messages are displayed")
    public void userShouldSeeWarningMessagesAreDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(nv.getFirstNameNotValidMessage().getText(),"First Name must be between 1 and 32 characters!");
        Assert.assertEquals(nv.getLastNameNotValidMessage().getText(),"Last Name must be between 1 and 32 characters!");
        Assert.assertEquals(nv.getEmailAddressNotValidMessage().getText(),"E-Mail Address does not appear to be valid!");
        Assert.assertTrue(nv.getPhoneNumberNotValidMessage().getText().contains("Telephone must be between 3 and 32 characters!"));
        Assert.assertTrue(nv.getPasswordErrorMessage().getText().contains("Password must be between 4 and 20 characters!"));
        Assert.assertEquals(nv.getErrorMessagePrivacyPolicy().getText(),"Warning: You must agree to the Privacy Policy!");

    }
}
