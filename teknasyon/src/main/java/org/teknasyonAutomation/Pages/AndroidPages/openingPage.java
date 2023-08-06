package org.teknasyonAutomation.Pages.AndroidPages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidActions;

public class openingPage extends androidActions {

    AndroidDriver driver;

    public openingPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //tagName[@attribute='value']

//    @AndroidFindBy(xpath = "//hierarchy//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.LinearLayout[2]//android.widget.LinearLayout//android.widget.Button[2]")
//    public List<WebElement> continueBtnn;

    @AndroidFindBy(xpath = "//hierarchy//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.ScrollView//android.widget.LinearLayout//android.widget.Button[2]")
    private WebElement okBtn;

    @AndroidFindBy(xpath = "//hierarchy//android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[2]//android.widget.ListView//android.widget.TextView[2]")
    private WebElement activityBtn;

    @FindBy(id = "//hierarchy//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.ScrollView//android.widget.LinearLayout//android.widget.Button[2]")
    private WebElement continueBtn;

    public static actionBarPage  goToModalPage() throws InterruptedException {
        continueBtn.click();
        Thread.sleep(3000);
        return new actionBarPage(driver);
    }

    public static actionBarPage goToAppPage() throws InterruptedException {
        okBtn.click();
        Thread.sleep(3000);
        return new actionBarPage(driver);
    }


}

