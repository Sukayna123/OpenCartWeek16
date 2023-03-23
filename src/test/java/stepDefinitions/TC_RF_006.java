package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Navigation;

import java.util.List;

public class TC_RF_006 {
    Navigation navigation=new Navigation();
    @And("Click on No radio option for Newsletter")
    public void clickOnNoRadioOptionForNewsletter() {
        navigation.clickMethod(navigation.getSubscribeNo());

    }

    @Then("Click on Unsubscribe to newsletter option")
    public void clickOnUnsubscribeToNewsletterOption() {
        navigation.clickMethod(navigation.getNewsletterForSubscriptionThirdPage());
        Assert.assertTrue(navigation.isPresent(navigation.getNewslettersSecondNoButton()));
    }

    @And("Enter new Account information into all the Fields First Name Last Name EMail Telephone Password Password Confirm and Privacy Policy Fields")
    public void enterNewAccountInformationIntoAllTheFieldsFirstNameLastNameEMailTelephonePasswordPasswordConfirmAndPrivacyPolicyFields(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        navigation.sendKeysMethod(navigation.getFirstName(), dataList.get(0));
        navigation.sendKeysMethod(navigation.getLastName(), dataList.get(1));
        navigation.sendKeysMethod(navigation.getEmail(), dataList.get(2));
        navigation.sendKeysMethod(navigation.getTelephone(), dataList.get(3));
        navigation.sendKeysMethod(navigation.getPassword(), dataList.get(4));
        navigation.sendKeysMethod(navigation.getPasswordConfirm(), dataList.get(5));
        navigation.clickMethod(navigation.getPrivacyPolicy());
    }
}
