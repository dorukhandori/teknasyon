package org.teknasyonAutomation;

import org.apache.commons.lang3.RandomStringUtils;
import org.teknasyonAutomation.Pages.AndroidPages.openingPage;
import org.teknasyonAutomation.Pages.AndroidPages.alertDialogPage;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class case3 extends androidBase {
    private AlertDialogsPage alertDialogsPage;

    @Test(dataProvider = "forgotPasswordData0")
    public void ActionTabTest() throws InterruptedException
    {
       openingPage OpeningPage = new openingPage(driver);
        openingPage.goToModalPage();
//        actionBarPage actionBarPage = openingPage.goToActionPage();
        openingPage.goToAppPage();

    }


        @Test
        public void testListDialog() {
            // 'List dialog' butonuna tıkla
            alertDialogPage.clickListDialogButton();

            // Rastgele bir liste öğesi seç
            alertDialogPage.selectRandomListItem();

            // Alert mesajını al
            String alertMessage = alertDialogPage.getAlertMessage();

            // Seçilen öğenin adını al
            String selectedListItem = alertMessage.split(": ")[1];

            // Doğru öğenin seçildiğini doğrula
            Assert.assertTrue(alertMessage.contains(selectedListItem), "Hata: Seçilen öğe doğru değil.");
        }
    }


}