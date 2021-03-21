package helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

public class Hooks {
    @Before
    public void config() {
        String browserName = PropertyLoader.loadProperty("browser");
        Configuration.browser = browserName;
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
    }
}
