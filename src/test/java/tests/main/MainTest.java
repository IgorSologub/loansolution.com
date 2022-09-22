package tests.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reviews.LOCATION_TITLES;
import static constants.Constant.Reviews.NUMBER_OF_LOCATION_BUTTONS;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static constants.Constant.Urls.ORDER_PAGE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("main");
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.waitOneSeconds();
    }

    @Test
    public void mainLogoLinkTest () {
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void getStartedNowButtonTest () {
        mainPage.getStartedNowButtonClick();
        basePage.waitFiveSeconds();
        assertEquals(ORDER_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void getStartedNowSecondButtonTest () {
        mainPage.getStartedNowSecondButtonClick();
        basePage.waitFiveSeconds();
        assertEquals(ORDER_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void getStartedNowThirdButtonTest () {
        mainPage.getStartedNowThirdButtonClick();
        basePage.waitFiveSeconds();
        assertEquals(ORDER_PAGE_URL, basePage.getCurrentUrl());
    }
}
