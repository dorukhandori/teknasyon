package org.teknasyonAutomation;

import org.teknasyonAutomation.TestUtils.AndroidUtils.androidBase;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.teknasyonAutomation.Pages.AndroidPages.openingPage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class case1 extends androidBase {


    @Test(dataProvider = "forgotPasswordData0")
    public void ActionTabTest() throws InterruptedException
    {
       openingPage OpeningPage = new openingPage(driver);
        openingPage.goToModalPage();
//        actionBarPage actionBarPage = openingPage.goToActionPage();
        openingPage.goToAppPage();

    }

    public String newPassword;
    @Test(dataProvider = "forgotPasswordData0")
    public void forgotPassword(HashMap<String, String> input) throws InterruptedException {
        openingPage.goToModalPage();
//        openingPage loginPage = openingPage.goToModalPage();

    }

    @DataProvider
    public Object[][] forgotPasswordData0() throws IOException {
        List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir") + "//src//test//java//org//RegressionTestsData//case1.json");
        return new Object[][]{{data.get(0)}};
    }

    public String passwordGenerator() {
        int length = 15;
        boolean useLetters = true;
        boolean useNumbers = true;
        newPassword = RandomStringUtils.random(length, useLetters, useNumbers);
        System.out.println("new password="+newPassword+".");

        return newPassword;
    }
}