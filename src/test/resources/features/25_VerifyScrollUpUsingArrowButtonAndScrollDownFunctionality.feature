
@Test25
Feature: Verify Scroll Up using 'Arrow' button and Scroll Down functionality

  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given Navigate to url "autoUrl"
    Then  Verify that home page is visible successfully
    Then  Scroll down page to bottom
    Then  Verify SUBSCRIPTION is visible
    Then  Click on arrow at bottom right side to move upward
    Then  Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

