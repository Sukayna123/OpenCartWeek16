package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_003 {

    Navigation navigation=new Navigation();
    @Given("navigate to opencart")
    public void navigateToOpencart() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
        BasicDriver.getDriver().manage().window().maximize();

    }

    @When("click my account")
    public void clickMyAccount() {
        navigation.clickMethod(navigation.getMyAccount());
    }

    @And("click on register option")
    public void clickOnRegisterOption() {
        navigation.clickMethod(navigation.getRegister());
    }

    @And("enter new account details into all the fields \\(FirstName,LastName,etc)")
    public void enterNewAccountDetailsIntoAllTheFieldsFirstNameLastNameEtc() {

//when you want to test it please make some changes to the data provided, thank you.
        navigation.sendKeysMethod(navigation.getFirstName(),"saaam");
        navigation.sendKeysMethod(navigation.getLastName(),"smith");
        navigation.sendKeysMethod(navigation.getEmail(),"saaam_smith@gmail.com");
        navigation.sendKeysMethod(navigation.getTelephone(),"2443355555");
        navigation.sendKeysMethod(navigation.getPassword(),"12345");
        navigation.sendKeysMethod(navigation.getPasswordConfirm(),"12345");
        navigation.clickMethod(navigation.getSubscribeYes());
        navigation.clickMethod(navigation.getPrivacyPolicy());

    }

    @And("click on continue button")
    public void clickOnContinueButton() {
        navigation.clickMethod(navigation.getContinueButton());
    }

    @Then("click continue button that is displayed in the account success page")
    public void clickContinueButtonThatIsDisplayedInTheAccountSuccessPage() {
        navigation.clickMethod(navigation.getContinueButtonSecondPage());

        Assert.assertTrue(BasicDriver.getDriver().getTitle().equalsIgnoreCase("My Account"));

    }
}
