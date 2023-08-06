package org.teknasyonAutomation;

import org.teknasyonAutomation.Pages.AndroidPages.hideAndShowPage;
import org.teknasyonAutomation.Pages.AndroidPages.notificationPage;
import org.teknasyonAutomation.Pages.AndroidPages.openingPage;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case7 extends androidBase {


    @Test(dataProvider = "forgotPasswordData0")
    public void ActionTabTest() throws InterruptedException
    {
       openingPage OpeningPage = new openingPage(driver);
        openingPage.goToModalPage();
//        actionBarPage actionBarPage = openingPage.goToActionPage();
        openingPage.goToAppPage();

    }

        @Test
        public void testNotification() {
            // 'Show Notification' butonuna tıkla
            notificationPage.clickShowNotificationButton();

            // Bildirim çubuğunun açıldığını doğrula
            Assert.assertTrue(notificationPage.isNotificationBarDisplayed(), "Hata: Bildirim çubuğu açılmadı.");

            // Bildirimi çekmek için Appium API'sini kullan
            driver.openNotifications();

            // Bildirim metnini al
            String notificationText = notificationPage.getNotificationText();

            System.out.println("notif text: " + notificationText);
        }


}