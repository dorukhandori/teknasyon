package org.teknasyonAutomation;

import org.teknasyonAutomation.Pages.AndroidPages.alertDialogPage;
import org.teknasyonAutomation.Pages.AndroidPages.openingPage;
import org.teknasyonAutomation.Pages.AndroidPages.deviceAdminPage;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case4 extends androidBase {
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
        public void testEnableAdmin() {
            // 'Enable Admin' butonuna tıkla
            deviceAdminPage.clickEnableAdminButton();

            // 'Activate' butonuna tıkla
            deviceAdminPage.clickActivateButton();

            // Aktif activity adını al
            String activeActivity = deviceAdminPage.getActiveActivity();

            // General activity olduğunu doğrula
            Assert.assertEquals(activeActivity, "GeneralActivity", "Hata: Aktif activity 'GeneralActivity' değil.");
        }
    }


}