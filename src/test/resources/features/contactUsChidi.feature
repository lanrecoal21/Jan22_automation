Feature: Contact customer care

  Background:
    Given I am on the application homepage
    And I select the sign link

    Scenario: Send message to customer care about order
      When I navigate to contact us page
      And I enter all the appropriate details about my order
      Then I should have my message successfully sent to customer care