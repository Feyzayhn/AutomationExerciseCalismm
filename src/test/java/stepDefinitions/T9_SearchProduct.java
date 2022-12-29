package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class T9_SearchProduct {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {

        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().refresh();
        page.productsButton.click();
        page.searchProduct.sendKeys("Madame Top For Women");
        page.searchButton.click();

    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {

        assertTrue(page.searhcedProducts.isDisplayed());

    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() throws IOException {

        for (WebElement w:page.searchedProductNames
             ) {
          assertTrue(w.isDisplayed());
        }

        ReusableMethods.jsScroll(page.wantedProduct);
        ReusableMethods.getScreenshotWebElement("aranan urun",page.wantedProduct);
    }


}
