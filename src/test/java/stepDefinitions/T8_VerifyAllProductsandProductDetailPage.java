package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.Driver2;
import utilities.ReusableMethods;

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

        assertTrue(page.allProduct.isDisplayed());
    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() {

        Driver2.getDriver().navigate().refresh();
        ReusableMethods.waitFor(3);

        int number=1;
        for (WebElement w: page.productList) {
            System.out.println(number + "=>" + w.getText());
            assertTrue(w.isDisplayed());
        }
    }

    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {

        ReusableMethods.jsScrollClick(page.viewProduct.get(0));
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {

        assertTrue(page.productInformation.isDisplayed());
    }

    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {

        assertTrue(page.productName.isDisplayed());
        assertTrue(page.productCategory.isDisplayed());
        assertTrue(page.productPrice.isDisplayed());
        assertTrue(page.productAvailability.isDisplayed());
        assertTrue(page.productCondition.isDisplayed());
        assertTrue(page.productBrand.isDisplayed());
    }
}
