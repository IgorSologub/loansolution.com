package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.blogCategory.BlogCategory;
import pages.contactUs.ContactUsPage;
import pages.main.MainPage;
import pages.order.OrderPage;
import pages.paydayLoans.PaydayLoansPage;

public class BaseTest {

    public BasePage basePage;
    public MainPage mainPage;
    public OrderPage orderPage;
    public ContactUsPage contactUsPage;
    public BlogCategory blogCategory;
    public PaydayLoansPage paydayLoansPage;

    public void startDriver (String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "main" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "contactUs" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
            case "blogCategory" :
                driver = CommonActions.createDriver("CHROME", 640, 360);
                break;
            case "paydayLoans" :
                driver = CommonActions.createDriver("CHROME", 768, 1024);
                break;
            case "order" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
        }
        basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
        orderPage = new OrderPage(driver);
        contactUsPage = new ContactUsPage(driver);
        blogCategory = new BlogCategory(driver);
        paydayLoansPage = new PaydayLoansPage(driver);
    }

    @AfterEach
    public void clearCookiesAndExit () {
        basePage.clearCookiesAndLocalStorageAndClose();
    }
}
