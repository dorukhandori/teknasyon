package org.teknasyonAutomation;

import org.teknasyonAutomation.Pages.AndroidPages.deviceAdminPage;
import org.teknasyonAutomation.Pages.AndroidPages.openingPage;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidActions;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case5 extends androidBase {
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
    public void testContextMenu() {
        // 'Long Press Me' butonuna uzun bas
        androidActions.longPressAction();

        // Rastgele bir menü öğesi seç
        boolean isMenuAOpened = contextMenuPage.isMenuAOpened();
        boolean isMenuBOpened = contextMenuPage.isMenuBOpened();

        // Seçilen menü öğelerini doğrula
        Assert.assertTrue(isMenuAOpened || isMenuBOpened, "Hata: Menü A veya Menü B açılmadı.");
    }
    }


}