package co.tala.appiumTests;

public class KeSplashScreenPageStrings implements SplashScreenStringsProvider {

    @Override
    public String getTitleString() {
        return "Karibu";
    }

    @Override
    public String getDescriptionString() {
        return "Apply and get decision instantly\n\nAccess loans 24/7\n\n" +
                "Build your credit to qualify for larger limits over time";
    }

    @Override
    public String getSignUpString() {
        return "I'M NEW - CREATE ACCOUNT";
    }

    @Override
    public String getSignInString() {
        return "SIGN IN";
    }
}
