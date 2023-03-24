package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_19 {
    Navigation navigation=new Navigation();
    @And("Enter new Account Details into all the Fields by adding leading and trailing spaces to the applicable fields")
    public void enterNewAccountDetailsIntoAllTheFieldsByAddingLeadingAndTrailingSpacesToTheApplicableFields() {
        navigation.sendKeysMethod(navigation.getFirstName(),"John nn" );
        navigation.sendKeysMethod(navigation.getLastName()," Do e");
        navigation.sendKeysMethod(navigation.getEmail()," johndoe11@gmail.commmmm");
        navigation.sendKeysMethod(navigation.getTelephone(),"1324 24233");
        navigation.sendKeysMethod(navigation.getPassword(),"sef s123");
        navigation.sendKeysMethod(navigation.getPasswordConfirm(),"sef s123");
        navigation.clickMethod(navigation.getPrivacyPolicy());

    }

    @Then("Clickk on Continue button")
    public void clickOnContinueButton() throws InterruptedException {
        navigation.clickMethod(navigation.getContinueButton());
        navigation.clickMethod(navigation.getEditAccount());

        BasicDriver.quitDriver();

    }
}
