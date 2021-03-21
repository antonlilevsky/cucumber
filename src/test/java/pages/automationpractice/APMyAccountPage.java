package pages.automationpractice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class APMyAccountPage {
    public static final String SIGN_OUT = "//a[@title='Log me out']";

    public void signOut() {
        $x(SIGN_OUT).shouldBe(visible).click();
    }

    public boolean isOpened() {
        return $x(SIGN_OUT).is(visible);
    }

    public APMyAccountPage waitTillPageIsLoaded() {
        $x(SIGN_OUT).shouldBe(visible);
        return this;
    }
}
