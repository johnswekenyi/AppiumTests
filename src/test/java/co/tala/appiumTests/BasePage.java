package co.tala.appiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * An abstract base for all the pages within the suite.
 */
public abstract class BasePage implements Page {
    public BasePage(AppiumDriver driver, Object[] args) {

    }

    public abstract MobileElement getToolbarImage();

    public abstract MobileElement getToolbarTitleText();

    public abstract void clickToolbarImage();
}

