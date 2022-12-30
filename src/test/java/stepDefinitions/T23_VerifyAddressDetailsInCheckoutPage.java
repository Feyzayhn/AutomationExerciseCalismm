package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutoExercisePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T23_VerifyAddressDetailsInCheckoutPage {

    AutoExercisePage page = new AutoExercisePage();

    List<String> registrationAddress = new ArrayList<>(Arrays.asList(Hooks.gender + " " +Hooks.firstName + " " +Hooks.lastName,
            Hooks.company,
            Hooks.address1,
            Hooks.address2,
            Hooks.city + " " +Hooks.state + " " +Hooks.zipCode,
            Hooks.country,
            Hooks.phoneNumber));

    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {

        for (int i = 1; i <page.deliveryAddressList.size() ; i++) {

           assertEquals(registrationAddress.get(i-1),page.deliveryAddressList.get(i).getText());
        }

    }

    @Then("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {

        for (int i = 1; i <page.billingAddressList.size() ; i++) {

            assertEquals(registrationAddress.get(i-1),page.billingAddressList.get(i).getText());
        }
    }
}
