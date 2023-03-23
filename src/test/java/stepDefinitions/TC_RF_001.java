package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_001 extends BasicDriver{

    Navigation abc = new Navigation();
    @Given("I am on the My Account page")
    public void ıAmOnTheMyAccountPage() {
        getDriver().manage().deleteAllCookies();
        getDriver().get("https://opencart.abstracta.us/");
        getDriver().manage().window().maximize();
    }

    @When("I click on the My Account page")
    public void ıClickOnTheMyAccountPage() {
        abc.clickMethod(abc.getMyAccount());
    }

    @And("I click Register option")
    public void ıClickRegisterOption() {
        abc.clickMethod(abc.getRegister());
    }

    @And("I enter new account details into the mandatory fields")
    public void ıEnterNewAccountDetailsIntoTheMandatoryFields() {
        abc.sendKeysMethod(abc.getFirstName(), "Lomana");
        abc.sendKeysMethod(abc.getLastName(), "LuaLua");
        abc.sendKeysMethod(abc.getEmail(), "lomanalualua_32_3232@gmail.com");
        abc.sendKeysMethod(abc.getTelephone(), "32323232");
        abc.sendKeysMethod(abc.getPassword(), "5555555");
        abc.sendKeysMethod(abc.getPasswordConfirm(), "5555555");
        abc.clickMethod(abc.getSubscribeYes());
        abc.clickMethod(abc.getPrivacyPolicy());

    }

    @And("I click on the Continue button")
    public void ıClickOnTheButton() {
        abc.clickMethod(abc.getContinueButton());
    }

    @And("I should see the Account Success page")
    public void ıShouldSeeThePage() {

        Assert.assertTrue(abc.getCongratulationsMessage().getText().contains("Congratulations! Your new account has been successfully created!"));
    }


    @Then("I click on the Second Continue button")
    public void ıClickOnTheSecondContinueButton() {
        abc.clickMethod(abc.getContinueButtonSecondPage());

        Assert.assertTrue(BasicDriver.getDriver().getTitle().contains("Account"));

    }
}
