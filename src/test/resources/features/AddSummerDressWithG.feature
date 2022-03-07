Feature: Add to cart

  Background:
    Given I am on the application homepage
    And I select the sign link


  Scenario: Add two printed summer dress with glasses to cart.
    Given I hover on product
    And I click on more
    And I change product quantity
    And I change product size
    And I add product to cart
    When I proceed to checkout
    And I confirm my order is successful
    And I go to contact us
    And I enter message to the support team
    Then My message should be send successfully