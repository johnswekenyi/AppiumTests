package co.tala.appiumTests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {

    @AndroidFindBy(id = "title_text_view")
    private MobileElement titleText;

    @AndroidFindBy(id = "description_text_view")
    private MobileElement descriptionText;

    @AndroidFindBy(id = "code_edit_text")
    private MobileElement codeEdit;

    @AndroidFindBy(id = "number_edit_text")
    private MobileElement numberEdit;

    @AndroidFindBy(id = "back_button")
    private MobileElement backButton;

    @AndroidFindBy(id = "next_button")
    private MobileElement nextButton;

    public MobileElement getTitleText() {
        return titleText;
    }

    public MobileElement getDescriptionText() {
        return descriptionText;
    }

    public MobileElement getCodeEdit() {
        return codeEdit;
    }

    public MobileElement getNumberEdit() {
        return numberEdit;
    }

    public MobileElement getBackButton() {
        return backButton;
    }

    public MobileElement getNextButton() {
        return nextButton;
    }
}
