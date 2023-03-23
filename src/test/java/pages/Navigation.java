package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BasicDriver;
import utility.DriverMethod;

public class Navigation extends DriverMethod {

    public Navigation(){
        PageFactory.initElements(BasicDriver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement register;

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-telephone")
    private WebElement telephone;

    @FindBy (id = "input-password")
    private WebElement password;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirm;

    @FindBy(xpath = "(//*[@type='radio'])[2]")
    private WebElement subscribeYes;

    @FindBy(xpath = "(//*[@type='radio'])[3] ")
    private WebElement subscribeNo;

    @FindBy (css = "input[type='checkbox']")
    private WebElement privacyPolicy;

    @FindBy(css = "input[type='submit']")
    private WebElement ContinueButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    private WebElement continueButtonSecondPage;

    @FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
    private WebElement myAccountHeader;

    @FindBy(xpath = "//i[@class=\"fa fa-exclamation-circle\"]")
    private WebElement WarningMessageForRegisteredAccount;
    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    private WebElement passwordNotMatchMessage;
    @FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
    private WebElement emailAddressNotValidMessage;

    @FindBy(css = "div.alert.alert-danger.alert-dismissible")
    private WebElement errorMessagePrivacyPolicy;

    @FindBy(xpath = "//div[text()= 'First Name must be between 1 and 32 characters!']")
    private WebElement firstNameNotValidMessage;

    @FindBy(xpath = "//div[text()= 'Last Name must be between 1 and 32 characters!']")
    private WebElement lastNameNotValidMessage;

    @FindBy(xpath = "//div[@class='pull-right']")
    private WebElement privacypolicyTextMessage;

    @FindBy(css = "ul[class='breadcrumb']")
    private WebElement brearCrumbs;

    @FindBy(xpath = "//a[text()='Your Store']")
    private WebElement header;

    public WebElement getPrivacypolicyTextMessage() {
        return privacypolicyTextMessage;
    }

    public WebElement getBrearCrumbs() {
        return brearCrumbs;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFirstNameNotValidMessage() {
        return firstNameNotValidMessage;
    }

    public WebElement getLastNameNotValidMessage() {
        return lastNameNotValidMessage;
    }

    public WebElement getEmailAddressNotValidMessage() {
        return emailAddressNotValidMessage;
    }

    public WebElement getPasswordNotMatchMessage() {
        return passwordNotMatchMessage;
    }

    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getRegister() {
        return register;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getTelephone() {
        return telephone;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getPasswordConfirm() {
        return passwordConfirm;
    }

    public WebElement getSubscribeYes() {
        return subscribeYes;
    }

    public WebElement getSubscribeNo() {
        return subscribeNo;
    }

    public WebElement getPrivacyPolicy() {
        return privacyPolicy;
    }

    public WebElement getContinueButton() {
        return ContinueButton;
    }

    public WebElement getContinueButtonSecondPage() {
        return continueButtonSecondPage;
    }

    public WebElement getMyAccountHeader() {
        return myAccountHeader;
    }

    public WebElement getWarningMessageForRegisteredAccount() {
        return WarningMessageForRegisteredAccount;
    }

    public WebElement getErrorMessagePrivacyPolicy() {
        return errorMessagePrivacyPolicy;
    }
}
