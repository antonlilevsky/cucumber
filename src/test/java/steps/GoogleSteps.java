package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.GoogleMainPage;
import pages.google.GoogleSearchResultsPage;
import pages.google.ResultingPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GoogleSteps {
    @Given("I open Google page")
    public void iOpenGooglePage() {
        GoogleMainPage mainPage = new GoogleMainPage();
        mainPage.open();
    }

    @When("I search {string}")
    public void iSearchSearch(String searchText) {
        GoogleMainPage mainPage = new GoogleMainPage();
        mainPage.searchForText(searchText);
    }

    @And("I open first search result")
    public void iOpenFirstSearchResult() {
        GoogleSearchResultsPage resultsPage = new GoogleSearchResultsPage();
        resultsPage.clickOnFirstResult();
    }

    @Then("The title is {string}")
    public void theTitleIsSearch(final String textToSearch) {
        ResultingPage page = new ResultingPage();
        assertThat(page.getTitle()).as("Title does not contain "+textToSearch).containsIgnoringCase(textToSearch);
    }
}
