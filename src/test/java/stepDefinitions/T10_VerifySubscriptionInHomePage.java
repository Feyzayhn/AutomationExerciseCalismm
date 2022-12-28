package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class T10_VerifySubscriptionInHomePage {

    AutoExercisePage page = new AutoExercisePage();
    @Then("Scroll down to footer")
    public void scrollDownToFooter() {
        ReusableMethods.jsScroll(page.subscriptionTitle);

    }

    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        assertTrue(page.subscriptionTitle.isDisplayed());
    }

    @Then("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {

        page.susbscribeEmail.sendKeys(Faker.instance().internet().emailAddress());
        page.subscriptionOkButton.click();
    }

    @And("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() throws IOException {

        assertTrue(page.subscriptionOkMessage.isDisplayed());
        ReusableMethods.getScreenshotWebElement("message",page.subscriptionOkMessage);
    }
}
