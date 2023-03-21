package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

import java.util.List;

public class TC_RF_021 {

    Navigation nv = new Navigation();
    @Given("Navigate to web site")
    public void navigateToWebSite() {
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Click on My Account drop menu and click on Register")
    public void clickOnMyAccountDropMenuAndClickOnRegister() {
        nv.clickMethod(nv.getMyAccount());
        nv.clickMethod(nv.getRegister());

    }

    @And("Fill the fields, first name, last name, email, telephone, password, confirm password")
    public void fillTheFieldsFirstNameLastNameEmailTelephonePasswordConfirmPassword(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        nv.sendKeysMethod(nv.getFirstName(),dataList.get(0));
        nv.sendKeysMethod(nv.getLastName(),dataList.get(1));
        nv.sendKeysMethod(nv.getEmail(),dataList.get(2));
        nv.sendKeysMethod(nv.getTelephone(),dataList.get(3));
        nv.sendKeysMethod(nv.getPassword(),dataList.get(4));
        nv.sendKeysMethod(nv.getPasswordConfirm(),dataList.get(5));


    }

    @And("Select newsletter subscription default No")
    public void selectNewsletterSubscriptionDefaultNo() {
        nv.clickMethod(nv.getSubscribeNo());
    }

    @And("Click on continue button")
    public void clickOnContinueButton() {
        nv.clickMethod(nv.getContinueButton());
    }

    @Then("Warning messages should be displayed for privacy policy")
    public void warningMessagesShouldBeDisplayedForPrivacyPolicy() {
        Assert.assertTrue(nv.isPresent(nv.getErrorMessagePrivacyPolicy()));


    }
}
