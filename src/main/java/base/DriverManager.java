package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    public static AppiumDriver driver;

    public static void initializeDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
