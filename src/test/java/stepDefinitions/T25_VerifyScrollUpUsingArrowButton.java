package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T25_VerifyScrollUpUsingArrowButton {
    AutoExercisePage page = new AutoExercisePage();

    @Then("Scroll down page to bottom")
    public void scrollDownPageToBottom() {

        ReusableMethods.jsScroll(page.subscriptionTitle);
    }

    @Then("Verify SUBSCRIPTION is visible")
    public void verifySUBSCRIPTIONIsVisible() {

        assertTrue(page.subscriptionTitle.isDisplayed());
    }

    @Then("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {

      ReusableMethods.jsScrollClick(page.upwardButton);
    }



    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {


        for (WebElement w:page.upwardMessageList
             ) {
            ReusableMethods.visibilityOfWait(w);
            assertTrue(w.isDisplayed());
        }
    }
}
