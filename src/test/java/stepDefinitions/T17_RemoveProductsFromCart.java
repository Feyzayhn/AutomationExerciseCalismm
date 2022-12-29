package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class T17_RemoveProductsFromCart {

    AutoExercisePage page = new AutoExercisePage();
    @Then("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {


        ReusableMethods.jsScrollClick(page.xButton);
        ReusableMethods.waitFor(2);
    }

    @And("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        assertTrue(page.cartIsEmpty.isDisplayed());
    }
}
