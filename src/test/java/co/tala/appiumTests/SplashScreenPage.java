package co.tala.appiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SplashScreenPage extends BaseAppiumPage{

    @AndroidFindBy(id = "title_text_view")
    private MobileElement titleText;

    @AndroidFindBy(id = "logo_image_view")
    private MobileElement logoImage;

    @AndroidFindBy(id = "description_text_view")
    private MobileElement descriptionText;

    @AndroidFindBy(id = "sign_up_button")
    private MobileElement signUpButton;

    @AndroidFindBy(id = "sign_in_button")
    private MobileElement signInButton;

    public SplashScreenPage(final AppiumDriver driver){
        super(driver);
    }

    public MobileElement getTitleText() {
        return titleText;
    }

    public MobileElement getLogoImage() {
        return logoImage;
    }

    public MobileElement getDescriptionText() {
        return descriptionText;
    }

    public MobileElement getSignUpButton() {
        return signUpButton;
    }

    public MobileElement getSignInButton() {
        return signInButton;
    }

    @Override
    public void verifyAtPage() {
        waitUntil(signUpButton);
        waitUntil(signInButton);
    }

    private void waitUntil(MobileElement signInButton) {
    }

    public void clickSignUpButton(){
        signUpButton.click();
    }
    public void clickSignInButton(){
        signInButton.click();
    }
}
