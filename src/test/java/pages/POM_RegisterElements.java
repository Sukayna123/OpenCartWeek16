package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BasicDriver;
import utility.DriverMethod;

public class POM_RegisterElements extends DriverMethod {
    public POM_RegisterElements() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement myAccount;

    @FindBy(linkText = "Register")
    private WebElement register;
    @FindBy(linkText = "Login")
    private WebElement login;
    @FindBy(linkText = "Continue")
    private WebElement continueButtonForNewCustomer;

    @FindBy(xpath = "(//a[text()='Register'])[2]")
    private WebElement registerButtonFromRightColumn;


    @FindBy(id = "input-firstname")
    private WebElement registerFirstName;
    @FindBy(id = "input-lastname")
    private WebElement registerLastName;
    @FindBy(id = "input-email")
    private WebElement registerEmail;

    @FindBy(id = "input-telephone")
    private WebElement registerTelephone;

    @FindBy(id = "input-password")
    private WebElement registerPassword;
    @FindBy(id = "input-confirm")
    private WebElement registerConfirmPassword;
    @FindBy(name = "agree")
    private WebElement registerCheckbox;
    @FindBy(css = "input[value='Continue']")
    private WebElement registerContinueButton;

    @FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
    private WebElement emailAddressNotValidMessage;

    public WebElement getEmailAddressNotValidMessage() {
        return emailAddressNotValidMessage;
    }

    public WebElement getRegisterContinueButton() {
        return registerContinueButton;
    }

    public WebElement getRegisterCheckbox() {
        return registerCheckbox;
    }

    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getRegister() {
        return register;
    }
    @FindBy(xpath = "(//input[@value='1'])[2]")
    private WebElement subscribeYesButton;
    @FindBy(xpath = "//input[@value='0']")
    private WebElement subscribeNoButton;

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    private WebElement passwordNotMuchMessage;

    public WebElement getSubscribeYesButton() {
        return subscribeYesButton;
    }

    public WebElement getSubscribeNoButton() {
        return subscribeNoButton;
    }

    public WebElement getPasswordNotMuchMessage() {
        return passwordNotMuchMessage;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getContinueButtonForNewCustomer() {
        return continueButtonForNewCustomer;
    }

    public WebElement getRegisterButtonFromRightColumn() {
        return registerButtonFromRightColumn;
    }

    public WebElement getRegisterFirstName() {
        return registerFirstName;
    }

    public WebElement getRegisterLastName() {
        return registerLastName;
    }

    public WebElement getRegisterEmail() {
        return registerEmail;
    }

    public WebElement getRegisterTelephone() {
        return registerTelephone;
    }

    public WebElement getRegisterPassword() {
        return registerPassword;
    }

    public WebElement getRegisterConfirmPassword() {
        return registerConfirmPassword;
    }
}
