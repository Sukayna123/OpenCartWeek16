package stepDefinitions;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.Navigation;

public class TC_RF_018 {

    Navigation nv = new Navigation();

    @And("Check the fields in the register account page")
    public void checkTheFieldsInTheRegisterAccountPage() {
        Assert.assertEquals(nv.getFirstName().getSize().getHeight(), 34);
        Assert.assertEquals(nv.getFirstName().getSize().getWidth(), 701);


        Assert.assertEquals(nv.getLastName().getSize().getHeight(), 34);
        Assert.assertEquals(nv.getLastName().getSize().getWidth(), 701);

        Assert.assertEquals(nv.getEmail().getSize().getHeight(), 34);
        Assert.assertEquals(nv.getEmail().getSize().getWidth(), 701);

        Assert.assertEquals(nv.getTelephone().getSize().getHeight(), 34);
        Assert.assertEquals(nv.getTelephone().getSize().getWidth(), 701);

        Assert.assertEquals(nv.getPassword().getSize().getHeight(), 34);
        Assert.assertEquals(nv.getPassword().getSize().getWidth(), 701);

        Assert.assertEquals(nv.getPasswordConfirm().getSize().getHeight(), 34);
        Assert.assertEquals(nv.getPasswordConfirm().getSize().getWidth(), 701);

    }

}

