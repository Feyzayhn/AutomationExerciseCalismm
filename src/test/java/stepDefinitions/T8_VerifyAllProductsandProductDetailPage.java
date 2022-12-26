package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.Driver2;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T8_VerifyAllProductsandProductDetailPage {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click on Products button")
    public void clickOnProductsButton() {

      page.productsButton.click();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        String expectedData = "https://automationexercise.com/products";
        String actualData = Driver2.getDriver().getCurrentUrl();
        assertEquals(expectedData,actualData);
    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() {

        List<WebElement> viewProduct = page.viewProduct;

        for (WebElement w:viewProduct) {
             assertTrue(w.isDisplayed());
            System.out.println(w);
        }
    }

    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        
    }

    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
    }
}
