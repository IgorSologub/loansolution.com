package pages.paydayLoans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class PaydayLoansPage extends BasePage {

    public PaydayLoansPage (WebDriver driver) {super(driver);}

    private final By faqButton = By.xpath("(//li[@class='eYFmA5 js-text-collapse '])[1]");
    private final By faqTextBlock = By.xpath("//div[@class='f93i5g']");
    private final By getStartedNowButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et j40QMt4Ja2']");
    private final By getStartedNowSecondButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et dr0uwK6']");
    private final By getStartedNowThirdButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et mQJUp']");
    private final By getStartedNowFourthButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et rFZnLnd']");

    public PaydayLoansPage faqButtonClick () {
        driver.findElement(faqButton).click();
        return this;
    }

    public boolean faqTextBlockCheck () {
        return elementVisibleCheck(faqTextBlock);
    }

    public PaydayLoansPage getStartedNowButtonClick () {
        driver.findElement(getStartedNowButton).click();
        return this;
    }

    public PaydayLoansPage getStartedNowSecondButtonClick() {
        driver.findElement(getStartedNowSecondButton).click();
        return this;
    }

    public PaydayLoansPage getStartedNowThirdButtonClick() {
        driver.findElement(getStartedNowThirdButton).click();
        return this;
    }

    public PaydayLoansPage getStartedNowFourthButtonClick() {
        driver.findElement(getStartedNowFourthButton).click();
        return this;
    }

}
