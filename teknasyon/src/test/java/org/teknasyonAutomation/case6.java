package org.teknasyonAutomation;

import org.teknasyonAutomation.Pages.AndroidPages.hideAndShowPage;
import org.teknasyonAutomation.Pages.AndroidPages.openingPage;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidActions;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case6 extends androidBase {


    @Test(dataProvider = "forgotPasswordData0")
    public void ActionTabTest() throws InterruptedException
    {
       openingPage OpeningPage = new openingPage(driver);
        openingPage.goToModalPage();
//        actionBarPage actionBarPage = openingPage.goToActionPage();
        openingPage.goToAppPage();

    }


        @Test
        public void testHideAndShow() {
            // Aktivite açıldığında iki 'Hide' butonunun ve iki textBox'ın görünür olduğunu doğrula
            Assert.assertTrue(hideAndShowPage.isHideButtonDisplayed(), "Hata: 'Hide' butonu görünmüyor.");
            Assert.assertTrue(hideAndShowPage.isTextBoxDisplayed(), "Hata: textBox görünmüyor.");

            // İkinci 'Hide' butonuna tıkla
            hideAndShowPage.clickHideButton();

            // TextBox alanının 'Hide' olduğunu ve 'Hide' butonunun 'Show' olduğunu doğrula
            String textBoxText = hideAndShowPage.getTextBoxText();
            Assert.assertEquals(textBoxText, "Hide", "Hata: TextBox metni 'Hide' değil.");
            Assert.assertTrue(hideAndShowPage.isHideButtonDisplayed(), "Hata: 'Show' butonu görünmüyor.");

            // 'Show' butonuna tıkla
            hideAndShowPage.clickHideButton();

            // TextBox alanının geri geldiğini ve 'Hide' butonunun tekrar görünür olduğunu doğrula
            Assert.assertTrue(hideAndShowPage.isTextBoxDisplayed(), "Hata: textBox görünmüyor.");
            Assert.assertTrue(hideAndShowPage.isHideButtonDisplayed(), "Hata: 'Hide' butonu görünmüyor.");
        }


}