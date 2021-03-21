package pages.google;

import com.codeborne.selenide.Selenide;
import helpers.PropertyLoader;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class GoogleSearchResultsPage extends BasePage{
    public static final String SEARCH_RESULTS = "//div[@class='g']//h3[not(contains(@class, 'r'))]";

    public GoogleSearchResultsPage clickOnFirstResult() {
        $x(SEARCH_RESULTS).shouldBe(visible).click();
        return this;
    }

    public void open(String searchText) {
        Selenide.open(format("%s/search?q=%s", PropertyLoader.loadProperty("url"),searchText));
    }
}
