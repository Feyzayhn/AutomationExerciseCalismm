package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;

import static org.junit.Assert.assertEquals;

public class T7_VerifyTestCasesPage {

    AutoExercisePage page = new AutoExercisePage();

    @Then("User Click on Test Cases button")
    public void userClickOnTestCasesButton() {

        page.testCasesButton.click();

    }

    @And("User Verify user is navigated to test cases page successfully")
    public void userVerifyUserIsNavigatedToTestCasesPageSuccessfully() {

        Assert.assertTrue(page.testCasesTitle.isDisplayed());

    }
}
