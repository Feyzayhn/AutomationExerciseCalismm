package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class T19_ViewCartBrandProducts {

    AutoExercisePage page = new AutoExercisePage();
    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {

        Driver.getDriver().navigate().refresh();
        assertTrue(page.brandsProducts.isDisplayed());

    }

    @Then("Click on any brand name")
    public void clickOnAnyBrandName() {


        ReusableMethods.jsScroll(page.brandsProducts);
        ReusableMethods.waitForVisibility(page.brandsProductsElement,3);
        ReusableMethods.jsScrollClick(page.brandsProductsElement);
    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() throws IOException {

     assertTrue(page.getBrandsProductsVerify.isDisplayed());
     ReusableMethods.jsScroll(page.brandsProductsTitle);
     assertTrue(page.brandsProductsTitle.isDisplayed());
     ReusableMethods.getScreenshotWebElement("Displayed brand products1",page.brandsProductsTitle);
    }

    @Then("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        ReusableMethods.jsScroll(page.brandsProducts);
        ReusableMethods.waitForVisibility(page.brandsProductsElement2,3);
        ReusableMethods.jsScrollClick(page.brandsProductsElement2);
    }

    @And("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() throws IOException {

        assertTrue(page.getBrandsProductsVerify.isDisplayed());
        assertTrue(page.brandsProductsTitle.isDisplayed());
        ReusableMethods.getScreenshotWebElement("Displayed brand products2",page.brandsProductsTitle);
    }
}
