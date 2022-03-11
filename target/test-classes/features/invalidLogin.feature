@ignore
Feature: Login


  Background:
    Given I am on the application homepage
    And I select the sign link

  Scenario Outline: login with invalid credentials should return the correct error message

    When You enter "<email>" address
    And You enter my "<password>"
    When We click the login button
    Then we should get the correct "<errorMessage>"

    Examples:
    |email                        |password            |errorMessage                           |
    |lanre.ikues@gmail.com        |testing             |Authentication failed.                 |
    |lanre.ikuesan@gmail.com      |testi               |Authentication failed.                 |
    |lanre.ikuesangmail.com       |testing             |Invalid email address.                 |
    |                             |testing             |An email address required.             |
    |lanre.ikuesan@gmail.com      |                    |Password is required.                  |
    |                             |                    |An email address required.             |
