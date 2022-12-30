
@Test22
Feature: Add to cart from Recommended items

  Scenario: Add to cart from Recommended items
    Given Navigate to url "autoUrl"
    Then  Scroll to bottom of page
    Then  Verify RECOMMENDED ITEMS are visible
    Then  Click on Add To Cart on Recommended product
    Then  Click on View Cart button
    And   Verify that product is displayed in cart page














