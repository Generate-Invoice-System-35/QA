package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class HomeScreen extends BasePageObject {
    private By homeScreen() {
        return MobileBy.xpath("//android.view.View[contains(@content-desc, 'Home')]");
    }

    private By buttonLogin() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sign In\"]");
    }

    @Step
    public boolean showHomeScreen() {
        return waitUntilPresence(homeScreen()).isDisplayed();
    }

    @Step
    public void tapSignInButton() {
        onClick(buttonLogin());
    }
}