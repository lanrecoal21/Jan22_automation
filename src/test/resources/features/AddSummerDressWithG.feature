Feature: Add to cart

  Background:
    Given I am on the application homepage
    And I select the sign link
    When I enter valid usernames
    And I enter valid passwords
    When I click login button
    Then I should see the application homepages


  Scenario: Add two printed summer dress with glasses to cart.

    Given I click on dresses
    Given I hover on product
    #And I click on more
    And I change product quantity
    And I change product size
    And I add product to cart
    And I confirm my order is successful
    When I proceed to checkout
    And I confirm the total sum is correct
    When I click on proceed to checkouts
    And I enter message to the support team
    And I proceed to checkout again
    And I agree the terms
    #When I click on proceed to checkout
    And I select payment method
    When I confirm my order
    Then My order should be send successfully
    When I click on contact uss
    And I select customer services
    And I selected my order reference
    #And i select product
    When I click on choose file
    And I write message to support
    When I click on send
    Then My message should be sent