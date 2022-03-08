Feature: Checkout for Chidi

  Background:
    Given I am on the application homepage
    And I select the sign link

    Scenario: Pick desired items and checkout successfully

      When I navigate to my desired collection
      And I choose my desired clothing and add to cart and proceed
      And I confirm the item cost and proceed
      And I agree to the terms of service and proceed
      And I confirm the total cost of item shipping and select payment method
      And I have my items checked out successfully
      And I navigate to contact us page
      And I enter all the appropriate details about my order
      Then I should have my message successfully sent to customer care

