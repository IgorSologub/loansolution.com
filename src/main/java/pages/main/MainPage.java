package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage (WebDriver driver) {super(driver);}

    private final By getStartedNowButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et j40QMt4Ja2']");
    private final By getStartedNowSecondButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et hPydhtPYZBMx']");
    private final By getStartedNowThirdButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et Ayh5t4uNo']");
    private final By getStartedNowFourthButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et LWi_ND2zDq']");

    public MainPage getStartedNowButtonClick () {
        driver.findElement(getStartedNowButton).click();
        return this;
    }

    public MainPage getStartedNowSecondButtonClick() {
        driver.findElement(getStartedNowSecondButton).click();
        return this;
    }

    public MainPage getStartedNowThirdButtonClick() {
        driver.findElement(getStartedNowThirdButton).click();
        return this;
    }

    public MainPage getStartedNowFourthButtonClick() {
        driver.findElement(getStartedNowFourthButton).click();
        return this;
    }

}
