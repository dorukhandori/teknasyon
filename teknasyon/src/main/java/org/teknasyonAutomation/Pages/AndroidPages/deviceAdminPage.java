package org.teknasyonAutomation.Pages.AndroidPages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidActions;
import org.testng.Assert;

import java.util.List;

public class deviceAdminPage extends androidActions {

    AndroidDriver driver;

    public deviceAdminPage(AndroidDriver driver) {
        super(driver);
        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    // Locators for ActionBar elements
    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[2]//android.widget.ListView//android.widget.TextView[3]")
    private WebElement enableAdminBtn;

    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[2]//android.widget.ListView//android.widget.TextView[1]")
    private WebElement activateBtn;


        private final By enableAdminButtonLocator = By.id("enableAdminButton");
        private final By activateButtonLocator = By.id("activateButton");




        public void clickEnableAdminButton() {
            driver.findElement(enableAdminButtonLocator).click();
        }

        public void clickActivateButton() {
            driver.findElement(activateButtonLocator).click();
        }

        public String getActiveActivity() {
            // Burada aktif activity adını almanız gerekebilir. Gerçek uygulamaya göre bu kodu düzenlemelisiniz.
            return "GeneralActivity";
        }
}
