
@Test26
Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given Navigate to url "autoUrl"
    Then  Verify that home page is visible successfully
    Then  Scroll down page to bottom
    Then  Verify SUBSCRIPTION is visible
    Then  Scroll up page to top
    And   Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen


