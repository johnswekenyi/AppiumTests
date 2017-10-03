package co.tala.appiumTests;

public class KeSigUpPageStrings implements SigUpStringsProvider {

    @Override
    public String getTitleTextString() {
        return "SIGN UP";
    }

    @Override
    public String getDescriptionTextString() {
        return "Enter your M-Pesa number";
    }

    @Override
    public String getSecondaryDescriptionString() {
        return "We'll send a confirmation code to verify your number.";
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
