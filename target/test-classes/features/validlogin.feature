@ignore
Feature: Login


 Background:
  Given I am on the application homepage
  And I select the sign link

 Scenario: User should be able to login with valid credentials

  When I enter valid username
  And I enter valid password
  When I click the login button
  Then I should be logged in successfully

