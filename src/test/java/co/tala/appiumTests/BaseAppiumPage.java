package co.tala.appiumTests;

import co.tala.appiumTests.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * An abstract base for all the no toolbar pages within the suite.
 */
public abstract class BaseAppiumPage extends BasePage {

    /**
     * A base constructor that sets the page's driver and verifies at page.
     * <p>
     * The page structure is being used within this test in order to separate the
     * page actions from the tests.
     * <p>
     * Please use the AppiumFieldDecorator class within the page factory. This way annotations
     * like @AndroidFindBy within the page objects.
     *
     * @param driver the appium driver created in the beforeSuite method
     * @param args   the arguments
     */
    protected BaseAppiumPage(final AppiumDriver driver, final Object... args) {
        super(driver, args);
    }

    /**
     * Throws unsupported operation exception when getting toolbar image.
     */
    @Override
    public MobileElement getToolbarImage() {
        throw new UnsupportedOperationException("Toolbar image is not allowed in here");
    }

    /**
     * Throws unsupported operation exception when getting toolbar title text.
     */
    @Override
    public MobileElement getToolbarTitleText() {
        throw new UnsupportedOperationException("Toolbar title text is not allowed here");
    }

    /**
     * Throws unsupported operation exception when clicking toolbar image.
     */
    @Override
    public void clickToolbarImage() {
        throw new UnsupportedOperationException("Clicking toolbar image is not allowed here");
    }

    public void waitUntil(final MobileElement mobileElement, final String value){
        waitUntil(mobileElement, value);
    }
}
