@Test11
Feature:  Verify Subscription in Cart page

  Scenario: Verify Subscription in Cart page
    Given Navigate to url "autoUrl"
    Then  Verify that home page is visible successfully
    Then Click Cart button
    Then Scroll down to footer
    Then Verify text SUBSCRIPTION
    Then Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible