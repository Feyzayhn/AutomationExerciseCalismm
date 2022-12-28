@Test13
Feature:  Verify Product quantity in Cart

  Scenario: Verify Product quantity in Cart
    Given Navigate to url "autoUrl"
    Then  Verify that home page is visible successfully
    Then Click View Product for any product on home page
    Then Verify product detail is opened
    Then Increase quantity to 4
    Then Click Add to cart button
    Then Click View Cart button
    And  Verify that product is displayed in cart page with exact quantity