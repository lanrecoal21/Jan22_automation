@ignore
Feature: Register new user

  Background:
    Given I am on the application homepage
    And I select the sign link

  Scenario: I want register a new account

    When I enter email to create a new account
    And I click on the create account button
    And I enter all required details
    When I click on the register button
    Then My account should be created successfully