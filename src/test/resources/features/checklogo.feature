Feature: Logo

  Background:
    Given I am on the application homepage
    #And I select the sign link

    Scenario: Check that application logo is displayed
      Then Application logo should be displayed
