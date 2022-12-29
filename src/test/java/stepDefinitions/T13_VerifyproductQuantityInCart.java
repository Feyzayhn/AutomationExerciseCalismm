package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T13_VerifyproductQuantityInCart {

    AutoExercisePage page = new AutoExercisePage();
    String quantity1;
    @Then("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        int index = ReusableMethods.random().nextInt(page.viewButtonProductList.size());
        ReusableMethods.jsScrollClick(page.viewButtonProductList.get(index));
        Driver.getDriver().navigate().refresh();
        ReusableMethods.jsScrollClick(page.viewButtonProductList.get(index));
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {

        assertTrue(page.productDetail.isDisplayed());
    }

    @Then("Increase quantity to {int}")
    public void ıncreaseQuantityTo(Integer quantity) {

        quantity1= String.valueOf(quantity);
        page.quantity.click();
        page.quantity.clear();
        page.quantity.sendKeys(quantity1);



    }

    @Then("Click Add to cart button")
    public void clickAddToCartButton() {

        page.addToCartButton.click();
    }

    @And("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {

        assertEquals(quantity1,page.quantityInCart.getText());
    }
}
