package tests.blogCategory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.base.BasePage;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.BLOG_CATEGORY_URL;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlogCategoryTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("blogCategory");
        basePage.goToUrl(BLOG_CATEGORY_URL);
        basePage.waitOneSeconds();
    }

    @Test
    public void mainLogoLinkTest () {
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void secondPageButtonTest () {
        blogCategory.secondPageButtonClick();
        basePage.waitFiveSeconds();
        assertEquals("https://loansolution.com/blog/page/2/", basePage.getCurrentUrl());
    }

    @Test
    public void postButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_POST_BUTTONS_BLOG_CATEGORY; i++) {
            basePage.waitOneSeconds();
            blogCategory.postButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(BLOG_CATEGORY_URL);
        }
        assertEquals(NUMBER_OF_POST_BUTTONS_BLOG_CATEGORY, goodTitlesCount);
    }

}
