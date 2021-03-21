package pages.automationpractice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class APRegistrationFormPage {
    public static final String TITLE_TEMPLATE = "//label[text()[contains(.,'%s')]]";
    public static final String FIRST_NAME = "//*[@id='customer_firstname']";
    public static final String LAST_NAME = "//*[@id='customer_lastname']";
    public static final String PASSWORD = "//*[@id='passwd']";
    public static final String DATE_DAYS = "//*[@id='days']";
    public static final String DATE_MONTH = "//*[@id='months']";
    public static final String DATE_YEAR = "//*[@id='years']";
    public static final String ADDRESS_1 = "//*[@id='address1']";
    public static final String CITY = "//*[@id='city']";
    public static final String STATE = "//*[@id='id_state']";
    public static final String POSTAL_CODE = "//*[@id='postcode']";
    public static final String MOBILE_PHONE = "//*[@id='phone_mobile']";
    public static final String SUBMIT_BUTTON = "//button[@id='submitAccount']";


    public APRegistrationFormPage setTitle(String title) {
        $x(format(TITLE_TEMPLATE, title)).shouldBe(visible).click();
        return this;
    }

    public APRegistrationFormPage setFirstName(String firstName) {
        $x(FIRST_NAME).shouldBe(visible).sendKeys(firstName);
        return this;
    }

    public APRegistrationFormPage setLastName(String lastName) {
        $x(LAST_NAME).shouldBe(visible).sendKeys(lastName);
        return this;
    }

    public APRegistrationFormPage setPassword(String pass) {
        $x(PASSWORD).shouldBe(visible).sendKeys(pass);
        return this;
    }

    public APRegistrationFormPage setDayOfBirth(String day) {
        $x(DATE_DAYS).selectOptionByValue(day);
        return this;
    }

    public APRegistrationFormPage setMonthOfBirth(String monthNum) {
        $x(DATE_MONTH).selectOptionByValue(monthNum);
        return this;
    }

    public APRegistrationFormPage setYearhOfBirth(String year) {
        $x(DATE_YEAR).selectOptionByValue(year);
        return this;
    }

    public APRegistrationFormPage setAddress1(String address) {
        $x(ADDRESS_1).shouldBe(visible).sendKeys(address);
        return this;
    }

    public APRegistrationFormPage setCity(String city) {
        $x(CITY).shouldBe(visible).sendKeys(city);
        return this;
    }

    public APRegistrationFormPage setState(String state) {
        $x(STATE).selectOptionContainingText(state);
        return this;
    }

    public APRegistrationFormPage setPostalCode(String code) {
        $x(POSTAL_CODE).shouldBe(visible).sendKeys(code);
        return this;
    }


    public void submitRegistrationForm() {
        $x(SUBMIT_BUTTON).shouldBe(visible,enabled).click();
    }

    public APRegistrationFormPage setMobile(String mobilePhone) {
        $x(MOBILE_PHONE).shouldBe(visible).sendKeys(mobilePhone);
        return this;
    }
}
