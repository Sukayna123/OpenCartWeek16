package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.POM_RegisterElements;
import utility.BasicDriver;

public class TC_RF_010 extends BasicDriver {
    POM_RegisterElements pom=new POM_RegisterElements();
    @Then("Enter new Account Details into the all Fields without mail")
    public void enterNewAccountDetailsIntoTheAllFieldsWithoutMail() {
        pom.sendKeysMethod(pom.getRegisterFirstName(),"Ali Asaf");
        pom.sendKeysMethod(pom.getRegisterLastName(),"Yucel");
        pom.sendKeysMethod(pom.getRegisterTelephone(),"0345623");
        pom.sendKeysMethod(pom.getRegisterPassword(),"AliAsaf.45");
        pom.sendKeysMethod(pom.getRegisterConfirmPassword(),"AliAsaf.45");
        pom.clickMethod(pom.getRegisterCheckbox());
    }

    @And("Enter email as {string}")
    public void enterEmailAs(String email) {
        pom.sendKeysMethod(pom.getRegisterEmail(),email);
        pom.clickMethod(pom.getRegisterContinueButton());
        Assert.assertEquals(pom.getEmailAddressNotValidMessage().getText(),"E-Mail Address does not appear to be valid!");
    }
}
