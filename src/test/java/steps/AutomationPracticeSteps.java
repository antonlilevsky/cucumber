package steps;

import core.UserAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.APAuthenticationPage;
import pages.automationpractice.APMyAccountPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AutomationPracticeSteps {
    APAuthenticationPage authenticationPage = new APAuthenticationPage();
    APMyAccountPage myAccount = new APMyAccountPage();

    @Given("UI-User creates user account with random email")
    public void createUserAccount() {
        authenticationPage
                .open()
                .setEmailAddressToCreateAnAccount(UserAccount.getEmail())
                .clickCreateAnAccountButton()
                .setTitle(UserAccount.getTitle())
                .setFirstName(UserAccount.getFirstName())
                .setLastName(UserAccount.getLastName())
                .setPassword(UserAccount.getPassword())
                .setDayOfBirth(String.valueOf(UserAccount.getDateOfBirth().getDayOfMonth()))
                .setMonthOfBirth(String.valueOf(UserAccount.getDateOfBirth().getMonth().ordinal() + 1))
                .setYearhOfBirth(String.valueOf(UserAccount.getDateOfBirth().getYear()))
                .setAddress1(UserAccount.getAddress())
                .setCity(UserAccount.getCity())
                .setState(UserAccount.getState())
                .setPostalCode(UserAccount.getZipCode())
                .setMobile(UserAccount.getMobilePhone())
                .submitRegistrationForm();
    }

    @And("UI-User logs out from system")
    public void uiUserLogsOutFromSystem() {
        myAccount.signOut();
    }

    @Given("UI-User opens Sign In page")
    public void uiUserOpensSignInPage() {
        authenticationPage.open();
    }

    @When("UI-User logs in")
    public void uiUserLogsIn() {
        authenticationPage.login(UserAccount.getEmail(), UserAccount.getPassword());
    }

    @Then("UI-User is logged in")
    public void uiUserIsLoggedIn() {
        assertThat(myAccount.waitTillPageIsLoaded().isOpened()).as("wrong page opened").isTrue();
    }
}
