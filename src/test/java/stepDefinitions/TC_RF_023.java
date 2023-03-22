package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Navigation;
import utility.BasicDriver;

import java.util.*;

public class TC_RF_023 {

    Navigation nv = new Navigation();
    @And("Click on login page link")
    public void clickOnLoginPageLink() {
        nv.clickMethod(nv.getLoginPageLink());
        Assert.assertTrue(nv.isPresent(nv.getLoginPageHeader()));
    }

    @And("Click on right column links")
    public void clickOnRightColumnLinks() {

        List<String> returnList = new ArrayList<>();
        List<WebElement> list = BasicDriver.getDriver().findElements(By.cssSelector(".list-group>a"));
        for (WebElement element : list) {
            returnList.add(element.getText());
        }

        List<String> actualRightColumnLinks = returnList;


        List<String> expectedRightColumnLinks = Arrays.asList("Login", "Register", "Forgotten Password", "My Account",
                "Address Book", "Wish List", "Order History", "Downloads", "Recurring payments", "Reward Points", "Returns", "Transactions", "Newsletter");

        Assert.assertEquals(expectedRightColumnLinks, expectedRightColumnLinks, "Failed to get header links");


        LinkedHashMap<String, String> rightColumnLinks = new LinkedHashMap<>();

        Collection<String> keyRightColumnLinks = rightColumnLinks.keySet();
        Collection<String> valueRightColumnLinks = rightColumnLinks.values();

        rightColumnLinks.put("Login", "New Customer");
        rightColumnLinks.put("My Account", "New Customer");
        rightColumnLinks.put("Address Book", "New Customer");
        rightColumnLinks.put("Wish List", "New Customer");
        rightColumnLinks.put("Order History", "New Customer");
        rightColumnLinks.put("Downloads", "New Customer");
        rightColumnLinks.put("Recurring payments", "New Customer");
        rightColumnLinks.put("Reward Points", "New Customer");
        rightColumnLinks.put("Returns", "New Customer");
        rightColumnLinks.put("Transactions", "New Customer");
        rightColumnLinks.put("Newsletter", "New Customer");


        for (String link : keyRightColumnLinks) {

            nv.clickMethod(nv.getRightColumnOptions());
            nv.setWait(3);

            String expectedRightColumnHeader = rightColumnLinks.getOrDefault(link, String.valueOf(valueRightColumnLinks));
            String actualRightColumnHeader = nv.getRightColumnHeader().getText();
            Assert.assertEquals(actualRightColumnHeader, expectedRightColumnHeader);
            BasicDriver.getDriver().navigate().back();
        }

        nv.clickMethod(nv.getRegisterRightColumn());
        String expectedRegisterHeader = "Account";
        String actualRegisterHeader = nv.getRegisterPageHeader().getText();
        Assert.assertEquals(actualRegisterHeader, expectedRegisterHeader);

        nv.clickMethod(nv.getForgottenPasswordRightColumn());
        String expectedForgottenPasswordHeader = "Your E-Mail Address";
        String actualForgottenPasswordHeader = nv.getForgottenPasswordPageHeader().getText();
        Assert.assertEquals(actualForgottenPasswordHeader, expectedForgottenPasswordHeader);

    }

    @And("Click on footer links")
    public void clickOnFooterLinks() {

        List<String> returnList = new ArrayList<>();
        List<WebElement> list = BasicDriver.getDriver().findElements(By.xpath("//footer//div[@class='container']//div[@class='col-sm-3']//ul//li"));
        for (WebElement element : list) {
            returnList.add(element.getText());
        }

        List<String> actualFooterLinks = returnList;
        List<String> expectedFooterLinks = Arrays.asList("About Us", "Delivery Information", "Privacy Policy", "Terms & Conditions", "Contact Us", "Returns", "Site Map", "Brands", "Gift Certificates", "Affiliate", "Specials", "My Account", "Order History", "Wish List", "Newsletter");
        Assert.assertEquals(actualFooterLinks, expectedFooterLinks);

        LinkedHashMap<String, String> footerLinks = new LinkedHashMap<>();

        Collection<String> keyFooterLinks = footerLinks.keySet();
        Collection<String> valueFooterLinks = footerLinks.values();

        footerLinks.put("About Us", "About Us");
        footerLinks.put("Delivery Information", "Delivery Information");
        footerLinks.put("Privacy Policy","Privacy Policy");
        footerLinks.put("Terms & Conditions","Terms & Conditions");
        footerLinks.put("Contact Us","Contact Us");
        footerLinks.put("Returns","Account");
        footerLinks.put("Site Map","Site Map");
        footerLinks.put("Brands","Find Your Favorite Brand");
        footerLinks.put("Gift Certificates","Account");
        footerLinks.put("Affiliate","Account");
        footerLinks.put("Specials","Special Offers");
        footerLinks.put("My Account","New Customer");
        footerLinks.put("Order History","New Customer");
        footerLinks.put("Wish List","New Customer");
        footerLinks.put("Newsletter","New Customer");

        for (String link : keyFooterLinks) {
            nv.clickLinks(link);
            nv.setWait(3);
            String expectedFooterHeader = footerLinks.getOrDefault(link, String.valueOf(valueFooterLinks));
            String actualFooterHeader = nv.getFooterHeader().getText();
            Assert.assertEquals(actualFooterHeader, expectedFooterHeader);
        }

    }

    @And("Click on menu options")
    public void clickOnMenuOptions() {
        List<String> returnList = new ArrayList<>();
        List<WebElement> list = BasicDriver.getDriver().findElements(By.cssSelector(".nav.navbar-nav>li"));
        for (WebElement element : list) {
            returnList.add(element.getText());
        }

        List<String> actualMenuLinks = returnList;

        List<String> expectedMenuLinks = Arrays.asList("Desktops", "Laptops & Notebooks", "Components",
                "Tablets", "Software", "Phones & PDAs", "Cameras", "MP3 Players");

        Assert.assertEquals(actualMenuLinks, expectedMenuLinks);

        LinkedHashMap<String, String> desktopLinks = new LinkedHashMap<>();
        Collection<String> keyDesktopLinks = desktopLinks.keySet();
        Collection<String> valueDesktopLinks = desktopLinks.values();

        desktopLinks.put("PC (0)", "PC");
        desktopLinks.put("Mac (1)", "Mac");
        desktopLinks.put("Show All Desktops", "Desktops");

        for (String link: keyDesktopLinks) {
            nv.clickSubLinks("Desktops", link);

            String expectedDesktopHeader = desktopLinks.getOrDefault(link, String.valueOf(valueDesktopLinks));
            String actualDesktopHeader = nv.getMenuHeader().getText();
            Assert.assertEquals(actualDesktopHeader,expectedDesktopHeader);

        }

        LinkedHashMap<String, String> laptopsNotebooksLinks = new LinkedHashMap<>();
        Collection<String> keyLaptopsNotebooksLinks = laptopsNotebooksLinks.keySet();
        Collection<String> valueLaptopsNotebooksLinks = laptopsNotebooksLinks.values();

        laptopsNotebooksLinks.put("Macs (0)", "Macs");
        laptopsNotebooksLinks.put("Windows (0)", "Windows");
        laptopsNotebooksLinks.put("Show All Laptops & Notebooks", "Laptops & Notebooks");

        for (String link: keyLaptopsNotebooksLinks) {
            nv.clickSubLinks("Laptops & Notebooks", link);

            String expectedLaptopsNotebooksHeader = laptopsNotebooksLinks.getOrDefault(link, String.valueOf(valueLaptopsNotebooksLinks));
            String actualLaptopsNotebooksHeader = nv.getMenuHeader().getText();
            Assert.assertEquals(actualLaptopsNotebooksHeader,expectedLaptopsNotebooksHeader);

        }

        LinkedHashMap<String, String> componentsLinks = new LinkedHashMap<>();
        Collection<String> keyComponentsLinksLinks = componentsLinks.keySet();
        Collection<String> valueComponentsLinksLinks = componentsLinks.values();

        componentsLinks.put("Mice and Trackballs (0)", "Mice and Trackballs");
        componentsLinks.put("Monitors (2)", "Monitors");
        componentsLinks.put("Printers (0)", "Printers");
        componentsLinks.put("Scanners (0)", "Scanners");
        componentsLinks.put("Web Cameras (0)", "Web Cameras");
        componentsLinks.put("Show All Components", "Components");

        for (String link: keyComponentsLinksLinks) {
            nv.clickSubLinks("Components", link);

            String expectedComponentsHeader = componentsLinks.getOrDefault(link, String.valueOf(valueComponentsLinksLinks));
            String actualComponentsHeader = nv.getMenuHeader().getText();
            Assert.assertEquals(actualComponentsHeader,expectedComponentsHeader);

        }

        LinkedHashMap<String, String> mP3PlayersLinks = new LinkedHashMap<>();
        Collection<String> keyMP3PlayersLinks = mP3PlayersLinks.keySet();
        Collection<String> valueMP3PlayersLinks = mP3PlayersLinks.values();

        mP3PlayersLinks.put("test 11 (0)", "test 11");
        mP3PlayersLinks.put("test 12 (0)", "test 12");
        mP3PlayersLinks.put("test 15 (0)", "test 15");
        mP3PlayersLinks.put("test 16 (0)", "test 16");
        mP3PlayersLinks.put("test 17 (0)", "test 17");
        mP3PlayersLinks.put("test 18 (0)", "test 18");
        mP3PlayersLinks.put("test 19 (0)", "test 19");
        mP3PlayersLinks.put("test 20 (0)", "test 20");
        mP3PlayersLinks.put("test 21 (0)", "test 21");
        mP3PlayersLinks.put("test 22 (0)", "test 22");
        mP3PlayersLinks.put("test 23 (0)", "test 23");
        mP3PlayersLinks.put("test 24 (0)", "test 24");
        mP3PlayersLinks.put("test 4 (0)", "test 4");
        mP3PlayersLinks.put("test 5 (0)", "test 5");
        mP3PlayersLinks.put("test 6 (0)", "test 6");
        mP3PlayersLinks.put("test 7 (0)", "test 7");
        mP3PlayersLinks.put("test 8 (0)", "test 8");
        mP3PlayersLinks.put("test 9 (0)", "test 9");


        for (String link: keyMP3PlayersLinks) {
            nv.clickSubLinks("MP3 Players", link);

            String expectedMP3PlayersLinksHeader = mP3PlayersLinks.getOrDefault(link, String.valueOf(valueMP3PlayersLinks));
            String actualMP3PlayersLinksHeader = nv.getMenuHeader().getText();
            Assert.assertEquals(actualMP3PlayersLinksHeader,expectedMP3PlayersLinksHeader);

        }

        LinkedHashMap<String, String> menuCategoryLinks = new LinkedHashMap<>();
        Collection<String> keyMenuCategoryLinks = menuCategoryLinks.keySet();
        Collection<String> valueMenuCategoryLinks = menuCategoryLinks.values();


        menuCategoryLinks.put("Tablets", "Tablets");
        menuCategoryLinks.put("Software", "Software");
        menuCategoryLinks.put("Phones & PDAs", "Phones & PDAs");

        for (String link: keyMenuCategoryLinks) {
            nv.clickLinks(link);

            String expectedMenuCategoryLinksHeader = menuCategoryLinks.getOrDefault(link, String.valueOf(valueMenuCategoryLinks));
            String actualMenuCategoryLinksHeader = nv.getMenuHeader().getText();
            Assert.assertEquals(actualMenuCategoryLinksHeader,expectedMenuCategoryLinksHeader);

        }

        nv.clickMethod(nv.getCamerasLink());
        String expectedCamerasLinkHeader = "Cameras";
        String actualCamerasLinkHeader = nv.getMenuHeader().getText();
        Assert.assertEquals(actualCamerasLinkHeader, expectedCamerasLinkHeader);

    }

    @And("Click on top links")
    public void clickOnTopLinks() {
        List<String> returnList = new ArrayList<>();
        List<WebElement> list = BasicDriver.getDriver().findElements(By.cssSelector("span.hidden-xs.hidden-sm.hidden-md"));
        for (WebElement element : list) {
            returnList.add(element.getText());
        }

        List<String> actualTopLinks = returnList;

        List<String> expectedTopLinks = Arrays.asList("Currency","123456789", "My Account", "Wish List (0)","Shopping Cart", "Checkout");

        Assert.assertEquals(actualTopLinks, expectedTopLinks);

        LinkedHashMap<String, String> currencyLinks = new LinkedHashMap<>();
        Collection<String> keyCurrencyLinks = currencyLinks.keySet();
        Collection<String> valueCurrencyLinks = currencyLinks.values();

        currencyLinks.put("€ Euro", "0 item(s) - 0.00€");
        currencyLinks.put("£ Pound Sterling", "0 item(s) - £0.00");
        currencyLinks.put("$ US Dollar", "0 item(s) - $0.00");

        for (String link: keyCurrencyLinks) {
            nv.clickTopSubLinks("Currency", link);

            String expectedCurrencyHeader = currencyLinks.getOrDefault(link, String.valueOf(valueCurrencyLinks));
            String actualCurrencyHeader = nv.getCartTotalCurrency().getText();
            Assert.assertEquals(actualCurrencyHeader,expectedCurrencyHeader);

        }

        LinkedHashMap<String, String> myAccountLinks = new LinkedHashMap<>();
        Collection<String> keyMyAccountLinks = myAccountLinks.keySet();
        Collection<String> valueMyAccountLinks = myAccountLinks.values();

        myAccountLinks.put("Register", "Account");
        myAccountLinks.put("Login", "New Customer");


        for (String link: keyMyAccountLinks) {
            nv.clickMyAccountSubLinks("My Account", link);

            String expectedMyAccountLinksHeader = myAccountLinks.getOrDefault(link, String.valueOf(valueMyAccountLinks));
            String actualMyAccountLinksHeader = nv.getMenuHeader().getText();
            Assert.assertEquals(actualMyAccountLinksHeader,expectedMyAccountLinksHeader);

        }

        LinkedHashMap<String, String> topMenuLinks = new LinkedHashMap<>();
        Collection<String> keyTopMenuLinks = topMenuLinks.keySet();
        Collection<String> valueTopMenuLinks = topMenuLinks.values();

        topMenuLinks.put("Wish List (0)", "New Customer");
        topMenuLinks.put("Shopping Cart", "Shopping Cart");
        topMenuLinks.put("Checkout", "Shopping Cart");


        for (String link: keyTopMenuLinks) {
            nv.clickTopMenuLinks(link);
            nv.setWait(3);

            String expectedTopMenuHeader = topMenuLinks.getOrDefault(link, String.valueOf(valueTopMenuLinks));
            String actualTopMenuHeader = nv.getMenuHeader().getText();
            Assert.assertEquals(actualTopMenuHeader,expectedTopMenuHeader);
            BasicDriver.getDriver().navigate().back();

        }

        nv.clickMethod(nv.getContactButton());
        String expectedContactHeader = "Contact Us";
        String actualContactHeader= nv.getMenuHeader().getText();
        Assert.assertEquals(actualContactHeader,expectedContactHeader);

    }
}

