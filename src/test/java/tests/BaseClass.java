package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class BaseClass {

    AppiumDriver driver;

    @BeforeTest
    public void setup() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName","Android");
            caps.setCapability("deviceName","Pixel_4_Appium");
            caps.setCapability("platformVersion","15.0");
            caps.setCapability("automationName","uiautomator2");
            caps.setCapability("app","C:\\Users\\91726\\Downloads\\Appium Setups\\appium-master\\appium-master\\repository\\Mobile_Automation_Project\\src\\test\\resources\\apps\\ApiDemos-debug.apk");
            caps.setCapability("appium:newCommandTimeout",60);

            URL url = new URL("http://127.0.0.1:4723");
            driver = new AppiumDriver(url,caps);

        } catch (Exception e) {
            System.out.print(e.getCause());
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest(){
        System.out.print("I am inside");
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
