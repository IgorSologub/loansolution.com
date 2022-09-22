package tests.contactUs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.ContactUs.*;
import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reviews.LOCATION_TITLES;
import static constants.Constant.Reviews.NUMBER_OF_LOCATION_BUTTONS;
import static constants.Constant.Urls.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactUsTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("contactUs");
        basePage.goToUrl(CONTACT_US_PAGE_URL);
        basePage.waitOneSeconds();
    }

    @Test
    public void mainLogoLinkTest () {
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void successfulContactUsTest () {
        basePage.waitFiveSeconds();
        contactUsPage.nameFieldSendKeys(NAME)
                .emailFieldSendKeys(EMAIL)
                .commentFieldSendKeys(COMMENT);
        basePage.waitOneSeconds();
        contactUsPage.sendMessageButtonClick();
        basePage.waitFiveSeconds();
        assertTrue(contactUsPage.formMessageCheck());
    }

    @Test
    public void unsuccessfulContactUsTest () {
        basePage.waitFiveSeconds();
        contactUsPage.nameFieldSendKeys(EMPTY)
                .emailFieldSendKeys(EMPTY)
                .commentFieldSendKeys(EMPTY);
        basePage.waitOneSeconds();
        contactUsPage.sendMessageButtonClick();
        basePage.waitFiveSeconds();
        assertTrue(contactUsPage.commentErrorCheck());
    }

}
