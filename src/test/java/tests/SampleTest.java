package tests;

import base.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;

import static base.DriverManager.driver;

public class SampleTest {

    @BeforeClass
    public void setup() throws Exception {
        DriverManager.initializeDriver();
    }

    @AfterClass
    public void teardown() {
        DriverManager.quitDriver();
    }

    @Test
    public void testAddition() {
        // Example: 2 + 3 = 5 using Calculator app
        driver.findElementById("com.android.calculator2:id/digit_2").click();
        driver.findElementByAccessibilityId("plus").click();
        driver.findElementById("com.android.calculator2:id/digit_3").click();
        driver.findElementByAccessibilityId("equals").click();

        AndroidElement result = (AndroidElement) driver.findElementById("com.android.calculator2:id/result");
        String actualResult = result.getText();

        System.out.println("Result = " + actualResu
