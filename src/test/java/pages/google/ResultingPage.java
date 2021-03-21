package pages.google;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ResultingPage extends BasePage {

    public String getTitle() {
        return getWebDriver().getTitle();
    }
}
