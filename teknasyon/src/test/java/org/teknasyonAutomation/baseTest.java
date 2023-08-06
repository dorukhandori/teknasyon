package org.teknasyonAutomation;

import org.teknasyonAutomation.Pages.AndroidPages.openingPage;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidBase;
import org.testng.annotations.Test;

public class baseTest extends androidBase {


    @Test
    public void goToAppPage() throws InterruptedException
    {
       openingPage OpeningPage = new openingPage(driver);
        OpeningPage.goToModalPage();
//        actionBarPage actionBarPage = openingPage.goToModalPage();



    }
}