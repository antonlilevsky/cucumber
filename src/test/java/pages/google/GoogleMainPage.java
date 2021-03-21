package pages.google;

import com.codeborne.selenide.Selenide;
import helpers.PropertyLoader;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

//@Url()
public class GoogleMainPage extends BasePage {

    public static final String SEARCH_FIELD = "//input[@autofocus]";

    public void searchForText(final String text) {
        $x(SEARCH_FIELD).shouldBe(visible).sendKeys(text, Keys.ENTER);
    }

    public void open() {
        Selenide.open(PropertyLoader.loadProperty("url"));
    }

}
