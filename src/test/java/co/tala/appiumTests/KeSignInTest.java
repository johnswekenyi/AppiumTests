package co.tala.appiumTests;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class KeSignInTest extends TestBaseKe {

    private LoginPage loginPage;
    private static SignInStringsProvider signInStringsProvider = new KeSignInPageStrings();

    @Test
    public void testLogin_fromSplashScreen(){
        assertThat(loginPage.getTitleText().getText(), is(signInStringsProvider.getTitleString()));
        assertThat(loginPage.getDescriptionText().getText(), is(signInStringsProvider.getDescriptionString()));
        assertTrue(loginPage.getCodeEdit().isDisplayed());
        assertThat(loginPage.getBackButton().getText(), is(signInStringsProvider.getBackButtonString()));
        assertThat(loginPage.getNextButton().getText(), is(signInStringsProvider.getNextButtonString()));
    }
}
