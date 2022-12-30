
@Test20
Feature: Search Products and Verify Cart After Login

  Scenario: Search Products and Verify Cart After Login
    Given Navigate to url "autoUrl"
    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  Enter product name in search input and click search button
    Then  Verify SEARCHED PRODUCTS is visible
    Then  Verify SEARCHED PRODUCTS is visible
    Then  Verify all the products related to search are visible
    Then  Add those products to cart
    Then  Click Cart button and verify that products are visible in cart
    Then  Click Signup Login button and submit login details
    Then  Again, go to Cart page
    Then  Verify that those products are visible in cart after login as well



