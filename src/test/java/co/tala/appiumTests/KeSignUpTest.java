package co.tala.appiumTests;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang3.Range;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class KeSignUpTest extends TestBaseKe{

    private SignUpPage signUpPage;
    private static SigUpStringsProvider sigUpStringsProvider = new KeSigUpPageStrings();

    public void setUpPage(){
        signUpPage = new SignUpPage();
    }

    @Test
    public void testLoadSignUp_fromSplashScreen(){
        assertThat(signUpPage.getTitleText().getText(), is(sigUpStringsProvider.getTitleTextString()));
        assertThat(signUpPage.getDescriptionText().getText(), is(sigUpStringsProvider.getDescriptionTextString()));
        assertThat(signUpPage.getSecondaryDescriptionTex().getText(), is(sigUpStringsProvider.getSecondaryDescriptionString()));
        assertTrue(signUpPage.getCodeEdit().isDisplayed());
        assertTrue(signUpPage.getNumberEdit().isDisplayed());
        assertThat(signUpPage.getBackButton().getText(), is(sigUpStringsProvider.getBackButtonString()));
        assertThat(signUpPage.getNextButton().getText(), is(sigUpStringsProvider.getNextButtonString()));
    }
}
