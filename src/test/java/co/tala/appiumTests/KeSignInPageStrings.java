package co.tala.appiumTests;

public class KeSignInPageStrings implements SignInStringsProvider{

    @Override
    public String getTitleString() {
        return "SIGN IN";
    }

    @Override
    public String getDescriptionString() {
        return "Enter your M-Pesa number";
    }

    @Override
    public String getBackButtonString() {
        return "BACK";
    }

    @Override
    public String getNextButtonString() {
        return "NEXT";
    }
}
