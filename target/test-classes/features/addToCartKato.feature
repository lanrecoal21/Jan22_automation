
Feature: CheckOut Kato

  Background:
    Given I am on the application homepage
    And I select the sign link
    When I enter valid username
    And I enter valid password
    When I click the login button
    Then I should be logged in successfully

    Scenario: Pick Faded Shirt and Checkout Successfully
      When I navigates to collection
      And I selects desired shirt and add to cart and proceed
      And I confirms the cost of item selected and proceed
      And I agreed to the Terms and Conditions and proceed
      And I confirms the Total cost of shipping item and select payment method
      And I check out items successfully
      And I navigates to the contact us
      And I enters all required details of order
      Then I should have message sent successfully to customer care