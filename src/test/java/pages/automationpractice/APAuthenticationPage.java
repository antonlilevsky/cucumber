package pages.automationpractice;

import com.codeborne.selenide.Selenide;
import helpers.PropertyLoader;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class APAuthenticationPage {
    public static final String CREATE_ACCOUNT_EMAIL_ADDRESS = "//input[@id='email_create']";
    public static final String CREATE_ACCOUNT_BUTTON = "//button[@id='SubmitCreate']";
    public static final String LOGIN_EMAIL = "//input[@id='email']";
    public static final String LOGIN_PASS = "//input[@id='passwd']";
    public static final String LOGIN_BUTTON = "//button[@id='SubmitLogin']";

    public APAuthenticationPage open() {
        Selenide.open(PropertyLoader.loadProperty("APurl"));
        return this;
    }

    public APAuthenticationPage setEmailAddressToCreateAnAccount(String email) {
        $x(CREATE_ACCOUNT_EMAIL_ADDRESS).shouldBe(visible).sendKeys(email);
        return this;
    }

    public APRegistrationFormPage clickCreateAnAccountButton() {
        $x(CREATE_ACCOUNT_BUTTON).shouldBe(visible, enabled).click();
        return new APRegistrationFormPage();
    }

    public void login(String email, String password) {
        $x(LOGIN_EMAIL).shouldBe(visible).sendKeys(email);
        $x(LOGIN_PASS).shouldBe(visible).sendKeys(password);
        $x(LOGIN_BUTTON).shouldBe(visible).click();
    }
}
