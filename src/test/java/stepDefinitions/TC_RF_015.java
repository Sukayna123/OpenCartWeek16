package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

import java.util.List;

public class TC_RF_015 {
    Navigation navigation=new Navigation();
    @Given("Navigate to Open Cart web page")
    public void navigateToOpenCartWebPage() {
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Click onn My Account Drop menu")
    public void clickOnnMyAccountDropMenu() {
        navigation.clickMethod(navigation.getMyAccount());

    }
    @And("Click onn Register option")
    public void clickOnnRegisterOption() {
        navigation.clickMethod(navigation.getRegister());
    }

    @And("Enter new Account Details into all the Fields")
    public void enterNewAccountDetailsIntoAllTheFields() {
        navigation.sendKeysMethod(navigation.getFirstName(),"Joh" );
        navigation.sendKeysMethod(navigation.getLastName(),"Doe");
        navigation.sendKeysMethod(navigation.getEmail(),"johndoe@gmail.coomm");
        navigation.sendKeysMethod(navigation.getTelephone(),"132424233");
        navigation.sendKeysMethod(navigation.getPassword(),"sefs12");
        navigation.sendKeysMethod(navigation.getPasswordConfirm(),"sefs12");
        navigation.clickMethod(navigation.getPrivacyPolicy());
    }

    @Then("Click onn Continue button")
    public void clickOnnContinueButton() throws InterruptedException {
        navigation.clickMethod(navigation.getContinueButton());
        navigation.clickMethod(navigation.getEditAccount());
        Assert.assertEquals(navigation.getFirstName().getAttribute("value"), "Joh");
        Assert.assertEquals(navigation.getLastName().getAttribute("value"),"Doe");
        Assert.assertEquals(navigation.getEmail().getAttribute("value"),"johndoe@gmail.coomm");
        Assert.assertEquals(navigation.getTelephone().getAttribute("value"),"132424233");


        BasicDriver.quitDriver();
    }
}
