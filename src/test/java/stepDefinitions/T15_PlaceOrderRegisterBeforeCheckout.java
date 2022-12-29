package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutoExercisePage;

public class T15_PlaceOrderRegisterBeforeCheckout {

    AutoExercisePage page = new AutoExercisePage();
    @Then("Click Signup Login button")
    public void clickSignupLoginButton() {

        page.signupLoginButton.click();
    }
}
