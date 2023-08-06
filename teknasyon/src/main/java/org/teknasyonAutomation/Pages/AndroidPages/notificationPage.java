package org.teknasyonAutomation.Pages.AndroidPages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidActions;

public class notificationPage extends androidActions {

    AndroidDriver driver;

    public notificationPage(AndroidDriver driver) {
        super(driver);
        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    // Locators for ActionBar elements
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button")
    private WebElement showNotificationButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement notificationBar;

    // Locators




    public void clickShowNotificationButton() {
       return showNotificationButton.click();
    }

    public boolean isNotificationBarDisplayed() {
        return notificationBar.isDisplayed();
    }

    public String getNotificationText() {
        return notificationBar.getText();
    }
}

