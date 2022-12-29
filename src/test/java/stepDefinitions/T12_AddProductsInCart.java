package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class T12_AddProductsInCart {

    AutoExercisePage page = new AutoExercisePage();
    @Then("Click Products button")
    public void clickProductsButton() {
        page.productsButton.click();
        Driver.getDriver().navigate().refresh();
        page.productsButton.click();
    }
    @Then("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        ReusableMethods.jsScrollClick(page.addToCart1);

    }

    @Then("Click Continue Shopping button")
    public void clickContinueShoppingButton() {

        page.continioShopping.click();
    }

    @Then("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        ReusableMethods.jsScrollClick(page.addToCart2);
    }

    @Then("Click View Cart button")
    public void clickViewCartButton() {

        ReusableMethods.jsScrollClick(page.viewCart);

    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {

        for (WebElement w:page.productListCart
             ) {
            assertTrue(w.isDisplayed());
        }
    }

    @And("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {

        assertTrue(page.firstProductPrice.isDisplayed());
        assertTrue(page.firstProductQuantity.isDisplayed());
        assertTrue(page.firstProductTotal.isDisplayed());
        assertTrue(page.secondProductPrice.isDisplayed());
        assertTrue(page.secondProductQuantity.isDisplayed());
        assertTrue(page.secondProductTotal.isDisplayed());


    }


}
