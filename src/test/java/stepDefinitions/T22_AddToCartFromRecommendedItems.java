package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class T22_AddToCartFromRecommendedItems {

    AutoExercisePage page = new AutoExercisePage();
    @Then("Scroll to bottom of page")
    public void scrollToBottomOfPage() {

        ReusableMethods.jsScroll(page.recommendedItems);
    }

    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {

        assertTrue(page.recommendedItems.isDisplayed());
    }
    @Then("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {

        ReusableMethods.jsScrollClick(page.recommendedAddToCartList.get(0));
    }

    @Then("Click on View Cart button")
    public void clickOnViewCartButton() {
        ReusableMethods.jsScrollClick(page.viewCart);
    }

    @And("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        ReusableMethods.waitForVisibility(page.recommendedCartProduct,3);
        assertTrue(page.recommendedCartProduct.isDisplayed());
    }


}
