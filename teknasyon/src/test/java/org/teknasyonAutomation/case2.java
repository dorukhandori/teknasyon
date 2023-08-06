package org.teknasyonAutomation;

import org.apache.commons.lang3.RandomStringUtils;
import org.teknasyonAutomation.Pages.AndroidPages.openingPage;
import org.teknasyonAutomation.Pages.AndroidPages.customTitlePage;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;



    public class case2 extends androidBase {
        @Test(dataProvider = "forgotPasswordData0")
        public void ActionTabTest() throws InterruptedException
        {
            openingPage OpeningPage = new openingPage(driver);
            openingPage.goToModalPage();
//        actionBarPage actionBarPage = openingPage.goToActionPage();
            openingPage.goToAppPage();

        }

        @Test
        public void testCustomTitlePage() {
            // Varsayılan metin değerlerini alın
            String defaultTextBoxText = customTitlePage.getDefaultTextBoxText();
            String defaultNavigationBarText = customTitlePage.getDefaultNavigationBarText();

            // Varsayılan metin değerlerini doğrulayın
            Assert.assertEquals(defaultTextBoxText, "Left is best\n");
            Assert.assertEquals(defaultNavigationBarText, "Right is always right");

            // Sol ve sağ metin kutularına yeni metin girin
            String leftText = "Left is bestEdited\n";
            String rightText = "Right Is always right";
            customTitlePage.enterLeftTextBox(leftText);
            customTitlePage.enterRightTextBox(rightText);

            // Güncellenen metin değerlerini alın
            String updatedTextBoxText = customTitlePage.getDefaultTextBoxText();
            String updatedNavigationBarText = customTitlePage.getDefaultNavigationBarText();

            // Güncellenen metin değerlerini doğrulayın
            Assert.assertEquals(updatedTextBoxText, leftText);
            Assert.assertEquals(updatedNavigationBarText, rightText);
        }
    }

