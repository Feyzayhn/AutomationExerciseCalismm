
@Test23
Feature: Verify address details in checkout page

  Scenario: Verify address details in checkout page
    Given Navigate to url "autoUrl"
    Then  Verify that home page is visible successfully
    Then  Click Signup Login button
    Then  Fill all details in Signup and create account
    Then  Verify ACCOUNT CREATED! and click Continue button
    Then  Verify Logged in as username at top
    Then  Add products to cart
    Then  Click Cart button
    Then  Verify that cart page is displayed
    Then  Click Proceed To Checkout
    Then  Verify that the delivery address is same address filled at the time registration of account
    Then  Verify that the billing address is same address filled at the time registration of account
    Then  Click Delete Account button
    And   Verify ACCOUNT DELETED! and click Continue button


