package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation;
import utility.BasicDriver;

public class TC_RF_007 {
    Navigation navigation = new Navigation();

//    @Given("Navigate to OpenCart")
//    public void navigateToOpenCart() {
//        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
//        BasicDriver.getDriver().manage().window().maximize();
//
//    }

    @When("I click on My Account Drop menu")
    public void iClickOnMyAccountDropMenu() {
        navigation.clickMethod(navigation.getMyAccount());
    }

    @And("I click on Register option")
    public void iClickOnRegisterOption() {
        navigation.clickMethod(navigation.getRegister());
    }
    @And("I click on my account drop menu")
    public void iclickonMyAccountDropMenu(){
        navigation.clickMethod(navigation.getMyAccount());
    }

    @And("Click on Login option")
    public void clickOnLoginOption() {
        navigation.clickMethod(navigation.getLogin());
    }


    @And("Click  on Continue button inside New Customer box")
    public void clickOnContinueButtonInsideNewCustomerBox() {
        navigation.clickMethod(navigation.getContinueInNewCostumerBox());

    }

    @And("Repeat Steps three and four")
    public void repeatStepsThreeAndFour() {
        navigation.clickMethod(navigation.getMyAccount());
        navigation.clickMethod(navigation.getLogin());

    }

    @Then("Click on Register option from the Right Column options")
    public void clickOnRegisterOptionFromTheRightColumnOptions() throws InterruptedException {
        navigation.clickMethod(navigation.getRegisterFromRightColum());

        BasicDriver.quitDriver();
    }



}
