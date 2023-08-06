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

public class hideAndShowPage extends androidActions {

    AndroidDriver driver;

    public hideAndShowPage(AndroidDriver driver) {
        super(driver);
        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    // Locators for ActionBar elements
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button")
    private WebElement hideButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText")
    private WebElement textBox;

    public boolean isHideButtonDisplayed() {
        return driver.findElement(hideButton).isDisplayed();
    }

    public boolean isTextBoxDisplayed() {
        return driver.findElement(textBox).isDisplayed();
    }

    public void clickHideButton() {
        driver.findElement(hideButton).click();
    }

    public String getTextBoxText() {
        return driver.findElement(textBox).getText();
    }
}

