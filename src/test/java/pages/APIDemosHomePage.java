package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class APIDemosHomePage {

    AppiumDriver driver;
    public APIDemosHomePage(AppiumDriver d)
    {
        driver = d;
        PageFactory.initElements(driver,this);
    }

}
