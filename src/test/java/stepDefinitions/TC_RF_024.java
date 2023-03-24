package stepDefinitions;

import io.cucumber.java.en.When;
import pages.Navigation;

public class TC_RF_024 {
    Navigation navigation = new Navigation();
    @When("Enter new Account Details into the all Fields without ConfirmPassword")
    public void enterNewAccountDetailsIntoTheAllFieldsWithoutConfirmPassword() {
        navigation.sendKeysMethod(navigation.getFirstName(),"saaam1");
        navigation.sendKeysMethod(navigation.getLastName(),"smith1");
        navigation.sendKeysMethod(navigation.getEmail(),"saaam_smith1@gmail.com");
        navigation.sendKeysMethod(navigation.getTelephone(),"2443355555");
        navigation.sendKeysMethod(navigation.getPassword(),"12345");
        navigation.sendKeysMethod(navigation.getPasswordConfirm(),"");
        navigation.clickMethod(navigation.getSubscribeYes());
        navigation.clickMethod(navigation.getPrivacyPolicy());



    }
}
