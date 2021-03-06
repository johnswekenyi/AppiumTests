package co.tala.appiumTests;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang3.Range;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class KeSplashScreenTest extends TestBaseKe{

    private SplashScreenPage splashScreenPage;
    private static SplashScreenStringsProvider splashScreenStringsProvider = new KeSplashScreenPageStrings();

    public void setUpPage(AppiumDriver driver){
        splashScreenPage = new SplashScreenPage(driver);
    }

    @Test
    public void testLoadSplashScreen_whenAppOpen(){
        //Confirm title text
        assertThat(splashScreenPage.getTitleText().getText(), is(splashScreenStringsProvider.getTitleString()));

        //confirm logo on splash screen
        assertTrue(splashScreenPage.getLogoImage().isDisplayed());

        //confirm description test is displayed
        assertThat(splashScreenPage.getDescriptionText().getText(), is(splashScreenStringsProvider.getDescriptionString()));

        //Confirm Signup button is displayed
        assertThat(splashScreenPage.getSignUpButton().getText(), is(splashScreenStringsProvider.getSignUpString()));

        //confirm SignIn button is displayed
        assertThat(splashScreenPage.getSignInButton().getText(), is(splashScreenStringsProvider.getSignInString()));
    }

    @Test
    public void testClickSignUpButton(){

        //When
        splashScreenPage.clickSignUpButton();

        //Then
        at(SignUpPage.class);
    }

    @Test
    public void testClickSignInButton(){

        //when
        splashScreenPage.clickSignInButton();

        //Then
    }

    private void at(Class<SignUpPage> signUpPageClass) {
    }
}
