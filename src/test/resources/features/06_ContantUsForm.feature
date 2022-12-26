@Test06
 Feature: Contant us form

   Scenario: Contant us form
     Given Navigate to url "autoUrl"
     Then  Verify that home page is visible successfully
     Then  User Click on Contact Us button
     Then  User Verify GET IN TOUCH is visible
     Then  User Enter name, email, subject and message
     Then  User Upload file
     Then  User Click Submit button
     Then  User Click OK button
     Then  User Verify success message Success! Your details have been submitted successfully. is visible
     And   User Click Home button and verify that landed to home page successfully