package pages.blogCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class BlogCategory extends BasePage {

    public BlogCategory (WebDriver driver) {super(driver);}

    private final By secondPageButton = By.xpath("//a[@class='iPSDxr']");
    private final By otherLoansButton = By.xpath("//a[@class='E6LpBnjW7b RoxUGFY6et mQJUp']");

    public BlogCategory postButtonClick(int numButton) {
        By postButtonClick = By.xpath("(//a[@class='RO4Bp9s'])[" + numButton + "]");
        driver.findElement(postButtonClick).click();
        return this;
    }

    public BlogCategory secondPageButtonClick () {
        driver.findElement(secondPageButton).click();
        return this;
    }



}
