package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class T21_AddReviewOnProdusct {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click on View Product button")
    public void clickOnViewProductButton() {
        ReusableMethods.jsScrollClick(page.viewProduct.get(0));
    }

    @Then("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {

        assertTrue(page.writeYourReview.isDisplayed());
    }

    @Then("Enter name, email and review")
    public void enterNameEmailAndReview() {

        page.writeYourName.sendKeys(Faker.instance().name().firstName());
        page.writeEmail.sendKeys(Faker.instance().internet().emailAddress());
        page.writeReview.sendKeys(Faker.instance().toString());
    }

    @Then("Click Submit button")
    public void clickSubmitButton() {

        ReusableMethods.jsScrollClick(page.submitWrite);
    }

    @And("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {

        assertTrue(page.writeSuccess.isDisplayed());
    }
}
