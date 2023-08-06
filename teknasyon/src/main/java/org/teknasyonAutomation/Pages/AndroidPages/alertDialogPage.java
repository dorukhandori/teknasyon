package org.teknasyonAutomation.Pages.AndroidPages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.teknasyonAutomation.TestUtils.AndroidUtils.androidActions;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class alertDialogPage extends androidActions {

    AndroidDriver driver;

    public alertDialogPage(AndroidDriver driver) {
        super(driver);
        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[4]")
    private WebElement listDialogButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
    private WebElement alertDialogBtn;

    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[2]//android.widget.ListView//android.widget.TextView[1]")
    private WebElement menuActionBarButton;


    public actionBarPage goToAlertDialogPage (){
        menuAppButton.click();
        alertDialogsBtn.click();
        return new actionBarPage(driver);
    }


        public void clickListDialogButton() {
            listDialogButton.click();
        }

        public void selectRandomListItem() {
            @AndroidFindBy(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
            public List<WebElement> listItems;

            int randomIndex = new Random().nextInt(listItems.size());
            listItems.get(randomIndex).click();
        }

        public String getAlertMessage() {
            Alert alert = driver.switchTo().alert();
            return alert.getText();
        }
    }
