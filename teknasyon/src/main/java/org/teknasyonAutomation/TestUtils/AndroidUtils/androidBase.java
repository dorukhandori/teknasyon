package org.teknasyonAutomation.TestUtils.AndroidUtils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.teknasyonAutomation.Pages.AndroidPages.openingPage;
import org.teknasyonAutomation.TestUtils.appiumUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class androidBase extends appiumUtils {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    public openingPage openingPage;

    @BeforeClass(alwaysRun=true)
    public void ConfigureAppium() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//teknasyonAutomation//Resources//configuration.properties");

        String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
        System.out.println(ipAddress);
        prop.load(fis);
        String port = prop.getProperty("port");
        String AppiumPath = prop.getProperty("AppiumPath");

        service = startAppiumServer(ipAddress,Integer.parseInt(port), AppiumPath);

        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName(prop.getProperty("AndroidDeviceName"));//emulator
        options.setChromedriverExecutable(System.getProperty("user.dir")+"//src//main//java//org//teknasyonAutomation//TestUtils//Drivers//ChromeDriver//chromedriver.exe");
        options.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        options.setCapability("autoGrantPermissions",true);
        options.setApp(System.getProperty("user.dir")+"//src//main//java//org//teknasyonAutomation//Resources//API-Demos.apk");

        driver = new AndroidDriver(service.getUrl(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        openingPage = new OpeningPage(driver);
    }

    @AfterClass(alwaysRun=true)
    public void tearDown() {
        driver.quit();
        service.stop();
    }
}
