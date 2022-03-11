Feature: Add to cart

  Background:
    Given I am on the application homepage
    And I select the sign link
    When I enter valid username
    And I enter valid password
    When I click the login button
    Then I should be logged in successfully

  Scenario: make a purchase order and checkout

    Given I hover on product and click more
    And I change quantity, size and colour
    And I add product to cart
    And I proceed to checkout
    And I confirm my order was successful
    And I send a message of enquiries
    Then my user should be completed