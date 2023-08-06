package org.teknasyonAutomation.Pages.AndroidPages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.junit.Assert;

import java.util.List;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidActions;

public class customTitlePage extends androidActions {

    AndroidDriver driver;

    public customTitlePage(AndroidDriver driver) {
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


    @FindBy(id = "00000000-0000-0058-ffff-ffff00000078\n[@index='0']")
    private WebElement tab1;

    @FindBy(id = "00000000-0000-0058-ffff-ffff0000004d")
    private WebElement tabModeToggle;
    @FindBy(id = "00000000-0000-0058-ffff-ffff0000004d")
    private WebElement addTabButton;

    @FindBy(id = "00000000-0000-0058-ffff-ffff0000004d")
    private WebElement removeLastTabButton;

    @FindBy(id = "00000000-0000-0058-ffff-ffff0000004d")
    private WebElement removeAllTabsButton;


    public int getTabCountTab() {
        // Eklenen sekmelerin listesini al
        List<WebElement> tabs = driver.findElements((By) tabModeToggle);
        return tabs.size();
    }
    public actionBarPage goToActionPage (){
        menuAppButton.click();
        return new actionBarPage(driver);
    }

    // Yeni eklenen kod
    public void verifyTabModeIsPassive() {
        // "Toggle tab mode"un pasif olduğunu doğrulamak için eklenen sekme sayısını kontrol edin
        int tabCount = getTabCountTab();

        // "Toggle tab mode" pasif olduğunda, eklenen sekme sayısı 0 olmalıdır.
        Assert.assertEquals(0, tabCount);
    }
    // Yeni sekme ekleme
    public void addTabs(int count) {
        for (int i = 0; i < count; i++) {
            addTabButton.click();
        }
    }


    // Son eklenen sekme silme
    public void removeLastTab() {
        removeLastTabButton.click();
    }

    // Tüm sekmeleri silme
    public void removeAllTabs() {
        removeAllTabsButton.click();
    }
}

