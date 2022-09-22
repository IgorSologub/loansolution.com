package tests.paydayLoans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Reviews.LOCATION_TITLES;
import static constants.Constant.Reviews.NUMBER_OF_LOCATION_BUTTONS;
import static constants.Constant.Urls.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaydayLoansTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("paydayLoans");
        basePage.goToUrl(PAYDAY_LOANS_URL);
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
        assertEquals("https://loansolution.com/order/?ref=loansolution-com-payday-loans", basePage.getCurrentUrl());
    }

    @Test
    public void getStartedNowSecondButtonTest () {
        paydayLoansPage.getStartedNowSecondButtonClick();
        basePage.waitFiveSeconds();
        assertEquals("https://loansolution.com/order/?ref=loansolution-com-payday-loans", basePage.getCurrentUrl());
    }

    @Test
    public void getStartedNowThirdButtonTest () {
        paydayLoansPage.getStartedNowThirdButtonClick();
        basePage.waitFiveSeconds();
        assertEquals("https://loansolution.com/order/?ref=loansolution-com-payday-loans", basePage.getCurrentUrl());
    }

    @Test
    public void getStartedNowFourthButtonTest () {
        paydayLoansPage.getStartedNowFourthButtonClick();
        basePage.waitFiveSeconds();
        assertEquals("https://loansolution.com/order/?ref=loansolution-com-payday-loans", basePage.getCurrentUrl());
    }

    }
