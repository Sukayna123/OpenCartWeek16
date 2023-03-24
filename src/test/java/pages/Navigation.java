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

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    private WebElement login;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueInNewCostumerBox;


    @FindBy(xpath = "//a[text()='Register']")
    private WebElement register;

    @FindBy(xpath = "(//a[text()='Register'])[2]")
    private WebElement registerFromRightColum;

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


    @FindBy(xpath = "//a[text()='Edit Account']")
    private WebElement editAccount;

    @FindBy(xpath = "(//div[@class='form-group required'])[1]")
    private WebElement getElementName;

    public WebElement getEditAccount() {
        return editAccount;
    }

    public WebElement getGetElementName() {
        return getElementName;
    }

    @FindBy(xpath = "//div[@id='content']//p// a")
    private WebElement loginPageLink;

    @FindBy(xpath = "//h2[text()='New Customer']")
    private WebElement loginPageHeader;

    @FindBy(css = ".list-group>a")
    private WebElement rightColumnOptions;

    @FindBy(css = "div[id='content']>h1,h2,h3")
    private WebElement rightColumnHeader;

    @FindBy(xpath = "//div[@class='list-group']//a[text()='Register']")
    private WebElement registerRightColumn;

    @FindBy(xpath = "//h1[text()='Account']")
    private WebElement registerPageHeader;

    @FindBy(xpath = "//legend[text()='Your E-Mail Address']")
    private WebElement forgottenPasswordPageHeader;

    @FindBy(xpath = "//div[@class='list-group']//a[text()='Forgotten Password']")
    private WebElement forgottenPasswordRightColumn;

    @FindBy(css = "div[id='content']>h1,h2,h3")
    private WebElement footerHeader;

    @FindBy(css = "div[id='content']>h1,h2,h3")
    private WebElement menuHeader;

    @FindBy(xpath = "//a[text()='Cameras']")
    private WebElement camerasLink;

    @FindBy(css = "span#cart-total")
    private WebElement cartTotalCurrency;

    @FindBy(css = "i.fa.fa-phone")
    private WebElement contactButton;

    public WebElement getNewsletterForSubscriptionThirdPage() {
        return newsletterForSubscriptionThirdPage;
    }

    @FindBy(xpath = "(//a[text()='Newsletter'])[1]")
    private WebElement newsletterForSubscriptionThirdPage;

    @FindBy(xpath = "(//*[@type='radio'])[1]")
    private WebElement newslettersSecondYesButton;

    @FindBy(xpath = "(//*[@type='radio'])[2]")
    private WebElement newslettersSecondNoButton;

    public WebElement getNewslettersSecondYesButton() {
        return newslettersSecondYesButton;
    }

    public WebElement getNewslettersSecondNoButton() {
        return newslettersSecondNoButton;
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

    @FindBy(xpath = "//div[text()= 'Telephone must be between 3 and 32 characters!']")
    private WebElement PhoneNumberNotValidMessage;

    public WebElement getPhoneNumberNotValidMessage() {
        return PhoneNumberNotValidMessage;
    }

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been success')]")
    private WebElement CongratulationsMessage;

    public WebElement getCongratulationsMessage() {
        return CongratulationsMessage;
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


    public WebElement getLogin() {
        return login;
    }
    public WebElement getContinueInNewCostumerBox() {
        return continueInNewCostumerBox;
    }
    public WebElement getRegisterFromRightColum() {
        return registerFromRightColum;
    }
    public WebElement getLoginPageLink() {
        return loginPageLink;
    }

    public WebElement getLoginPageHeader() {
        return loginPageHeader;
    }

    public WebElement getRightColumnOptions() {
        return rightColumnOptions;
    }

    public WebElement getRightColumnHeader() {
        return rightColumnHeader;
    }

    public WebElement getRegisterRightColumn() {
        return registerRightColumn;
    }

    public WebElement getRegisterPageHeader() {
        return registerPageHeader;
    }

    public WebElement getForgottenPasswordPageHeader() {
        return forgottenPasswordPageHeader;
    }

    public WebElement getForgottenPasswordRightColumn() {
        return forgottenPasswordRightColumn;
    }

    public WebElement getFooterHeader() {
        return footerHeader;
    }

    public WebElement getMenuHeader() {
        return menuHeader;
    }

    public WebElement getCamerasLink() {
        return camerasLink;
    }

    public WebElement getCartTotalCurrency() {
        return cartTotalCurrency;
    }

    public WebElement getContactButton() {
        return contactButton;

    }
}
