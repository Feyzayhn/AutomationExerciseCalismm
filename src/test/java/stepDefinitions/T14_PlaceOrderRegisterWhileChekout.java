package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.waitFor;

public class T14_PlaceOrderRegisterWhileChekout {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Add products to cart")
    public void addProductsToCart() {

        int index = ReusableMethods.random().nextInt(page.addToCartList.size());
        ReusableMethods.jsScrollClick(page.addToCartList.get(index));
        page.viewCart.click();

    }

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {

        assertTrue(page.shoppingCart.isDisplayed());

    }

    @Then("Click Proceed To Checkout")
    public void clickProceedToCheckout() {

        ReusableMethods.jsScrollClick(page.proceedToChechkoutButton);
    }

    @Then("Click Register Login button")
    public void clickRegisterLoginButton() {

        ReusableMethods.jsScrollClick(page.registerLogin);

    }

    @Then("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {

        Hooks user = new Hooks();
        user.registerUser1();

    }

    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {

        assertTrue(page.accountCreatedText.isDisplayed());
        page.continueButton.click();
        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
        page.continueButton.click();


    }

    @Then("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {

        assertTrue(page.loggedInAsUsername.isDisplayed());
    }


    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        for (WebElement w : page.detailsReviewList
        ) {
            assertTrue(w.isDisplayed());
        }
    }

    @Then("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {

        page.descriptionBox.sendKeys(ReusableMethods.random().toString());
        jsScrollClick(page.placeHolderButton);

        Driver.getDriver().navigate().back();
        jsScrollClick(page.placeHolderButton);

    }

    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        page.nameOnCard.sendKeys(Faker.instance().name().firstName());
        page.cardNumber.sendKeys(Faker.instance().number().digits(16));
        page.cardCvv.sendKeys(Faker.instance().number().digits(3));
        page.cardDate.sendKeys("12");
        page.cardYear.sendKeys("2026");
    }

    @Then("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        ReusableMethods.jsScrollClick(page.payAndConfirmOrderButton);

    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        ReusableMethods.waitFor(2);
        assertTrue(page.successMessageOrder.get(0).isDisplayed());
    }

    @And("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {

        assertTrue(page.accountDeletedTitle.isDisplayed());
        ReusableMethods.jsScrollClick(page.continueButtonDelete);

    }
}
