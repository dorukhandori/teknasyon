package org.teknasyonAutomation.TestUtils.IOSUtils;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.teknasyonAutomation.TestUtils.appiumUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class IOSBase extends appiumUtils {

    public IOSDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass(alwaysRun = true)
    public void ConfigureAppium() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\pharmacyApp\\Resources\\configuration.properties");

        prop.load(fis);
        String ipAddress = prop.getProperty("ipAddress");
        String port = prop.getProperty("port");
        String AppiumPath = prop.getProperty("AppiumPath");

        service = startAppiumServer(ipAddress,Integer.parseInt(port),AppiumPath);

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("IOSDeviceName");
        options.setApp(System.getProperty("user.dir")+"\\src\\main\\java\\org\\pharmacyApp\\Resources\\com.alhabibpharmacy.dev.apk");
        options.setPlatformVersion("IOSPlatformVersion");
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));

        driver = new IOSDriver(service.getUrl(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
        service.stop();
    }

}
