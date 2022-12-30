package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class T18_ViewCategoryProducts {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {

        assertTrue(page.category.isDisplayed());

    }

    @Then("Click on Women category")
    public void clickOnWomenCategory() {

        ReusableMethods.jsScrollClick(page.womenCategory);
    }

    @Then("Click on any category link under Women category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {

        ReusableMethods.waitFor(1);
        ReusableMethods.jsScrollClick(page.dressLink);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.jsScrollClick(page.womenCategory);
        ReusableMethods.jsScrollClick(page.dressLink);
    }

    @Then("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {

        assertTrue(page.womenProducts.isDisplayed());
    }

    @Then("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {

        ReusableMethods.jsScrollClick(page.menCategory);

        ReusableMethods.jsScrollClick(page.jeansLink);

    }

    @And("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {

     assertTrue(page.menCategoryAssert.isDisplayed());
    }


}
