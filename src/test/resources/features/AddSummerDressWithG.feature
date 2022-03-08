Feature: Add to cart

  Background:
    Given I am on the application homepage
    And I select the sign link
    When I enter valid username
    And I enter valid password
    When I click the login button
    Then I should be logged in successfully


  Scenario: Add two printed summer dress with glasses to cart.

    Given I hover on product
    And I click on more
    And I change product quantity
    And I change product size
    And I add product to cart
    And I confirm my order is successful
    When I proceed to checkout
    And I confirm the total sum is correct
    When I click on proceed to checkout
    And I enter message to the support team
    And I proceed to checkout again
    And I agree the terms
    When I click on proceed to checkout
    And I select payment method
    When I confirm my order
    Then My order should be send successfully