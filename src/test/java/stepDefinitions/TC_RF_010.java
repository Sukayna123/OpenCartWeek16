package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_010 extends BasicDriver {
    Navigation nv=new Navigation();
    @Then("Enter new Account Details into the all Fields without mail")
    public void enterNewAccountDetailsIntoTheAllFieldsWithoutMail() {
        nv.sendKeysMethod(nv.getFirstName(),"Pavan");
        nv.sendKeysMethod(nv.getLastName(),"Kavan");
        nv.sendKeysMethod(nv.getTelephone(),"0345623");
        nv.sendKeysMethod(nv.getPassword(),"pavan.45");
       nv.sendKeysMethod(nv.getPasswordConfirm(),"pavan.45");
        nv.clickMethod(nv.getPrivacyPolicy());
    }

    @And("Enter email as {string}")
    public void enterEmailAs(String email) {
        nv.sendKeysMethod(nv.getEmail(),email);
        nv.clickMethod(nv.getContinueButton());
        Assert.assertEquals(nv.getEmailAddressNotValidMessage().getText(),"E-Mail Address does not appear to be valid!");
    }
}
