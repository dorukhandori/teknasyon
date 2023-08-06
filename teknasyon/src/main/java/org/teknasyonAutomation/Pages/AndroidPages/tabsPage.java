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

public class tabsPage extends androidActions {

    AndroidDriver driver;

    public tabsPage(AndroidDriver driver) {
        super(driver);
        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    // Locators for ActionBar elements
    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[2]//android.widget.ListView//android.widget.TextView[3]")
    private WebElement menuAppButton;

    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[2]//android.widget.ListView//android.widget.TextView[1]")
    private WebElement menuActionBarButton;

    @FindBy(xpath = "//hierarchy//android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[2]//android.widget.ListView//android.widget.TextView[2]")
    private WebElement menuActionBarTabsButton;

    private final By tabLayoutLocator = By.id("tabLayout");


    public void switchToTab(int tabIndex) {
        List<MobileElement> tabs = driver.findElements(tabLayoutLocator);
        if (tabs.size() > tabIndex) {
            tabs.get(tabIndex).click();
        }
    }

    public boolean isTabDisplayed(int tabIndex) {
        List<MobileElement> tabs = driver.findElements(tabLayoutLocator);
        return tabs.size() > tabIndex && tabs.get(tabIndex).isDisplayed();
    }

    public String getOpenedPageInfo() {
        // Bu bölümü senaryonuza göre düzenlemeniz gerekebilir.
        // Gerçek uygulamada açılan sayfadan bilgiyi almalısınız.
        // Örneğin, bir metin görüntüleniyor olabilir.
        // Burada detayın açılma ve bilgi alması gibi işlemleri simüle ediyoruz.
        return "Tab 30: Sample Page Info";
    }
}

