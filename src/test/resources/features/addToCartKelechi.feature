Feature:

  Background:
    Given I am on the application homepage
    And I select the sign link


    Scenario:
      When I enter correct email
      And I enter correct password
      When I click the login link
      And I am successfully logged in
      When I click on the dresses category link
      And I click an item (printed summer dress)
      And I change the quantity to three
      And I change the size to M (medium)
      When I click the Add to Cart button
      And I click the Proceed to Checkout button
      And I click Proceed to Checkout button again
      And I add a comment about the item selected in the text field
      When I click Proceed to Checkout
      And I accept the terms of service
      And I click Proceed to Checkout button
      When I select to pay by bank wire
      And click the I confirm my order button
      Then I should receive an order confirmation
      


