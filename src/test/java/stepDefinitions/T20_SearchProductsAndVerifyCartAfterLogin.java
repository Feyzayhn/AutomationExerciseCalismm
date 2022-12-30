package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.AutoExercisePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.jsScrollClick;

public class T20_SearchProductsAndVerifyCartAfterLogin {
    AutoExercisePage page = new AutoExercisePage();
    @Then("Add those products to cart")
    public void addThoseProductsToCart() {
        ReusableMethods.jsScrollClick(page.cartButton20);
    }

    @Then("Click Cart button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() {

        ReusableMethods.jsScrollClick(page.viewCart);
        assertTrue(page.cartProducts.isDisplayed());
    }

    static String phoneNumber;
    static String firstname;
    static String lastname;
    static String country;
    static String email;
    static String password;
    @Then("Click Signup Login button and submit login details")
    public void clickSignupLoginButtonAndSubmitLoginDetails() {
       ReusableMethods.jsScrollClick(page.signupLoginLink);
        getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("autoUrl"));
        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windows.get(1));

        email = Faker.instance().internet().emailAddress();
        password = Faker.instance().internet().password();


        firstname = Faker.instance().name().firstName();
        lastname = Faker.instance().name().lastName();
        phoneNumber = Faker.instance().phoneNumber().cellPhone();

        jsScrollClick(page.signupLoginLink);
        page.nameBoxSignup.sendKeys(Faker.instance().name().name());
        page.emailBoxSignup.sendKeys(email);
        page.signupButton.click();
        page.genderList.get(0).click();
        page.passwordBoxNewSignup.sendKeys(password);

        selectDropDown(page.dayDDM);
        selectDropDown(page.monthDDM);
        selectDropDown(page.yearDDM);
        jsScrollClick(page.newsletter);
        jsScrollClick(page.partners);

        jsScroll(page.firstnameBoxNewSignup);
        waitFor(2);
        getActions()
                .click(page.firstnameBoxNewSignup)
                .sendKeys(firstname).sendKeys(Keys.TAB)
                .sendKeys(lastname).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().company().name()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB).perform();

        selectDdmIndex(page.country);
        country = select(page.country).getFirstSelectedOption().getText();
        jsScroll(page.country);
        waitFor(2);

        getActions()
                .click(page.state)
                .sendKeys(Faker.instance().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(phoneNumber).perform();
        jsScrollClick(page.createAccountButton);


        getDriver().switchTo().window(windows.get(0));


        page.emailBoxLogin.sendKeys(email);
        page.passwordBoxLogin.sendKeys(password);
        jsScrollClick(page.loginButton);
    }

    @Then("Again, go to Cart page")
    public void againGoToCartPage() {

        ReusableMethods.jsScrollClick(page.cartButton);

    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {

        assertTrue(page.cartProducts.isDisplayed());

    }
}
