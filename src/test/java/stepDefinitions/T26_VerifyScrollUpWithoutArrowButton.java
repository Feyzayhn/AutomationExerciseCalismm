package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

public class T26_VerifyScrollUpWithoutArrowButton {

    AutoExercisePage page = new AutoExercisePage();
    @Then("Scroll up page to top")
    public void scrollUpPageToTop() {

        ReusableMethods.jsScrollClick(page.upwardButton);
    }
}
