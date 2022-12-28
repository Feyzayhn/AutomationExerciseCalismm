package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutoExercisePage;

public class T11_VerifySubscriptionInCartPage {
    AutoExercisePage page = new AutoExercisePage();

    @Then("Click Cart button")
    public void clickCartButton() {

        page.cartButton.click();
    }
}
