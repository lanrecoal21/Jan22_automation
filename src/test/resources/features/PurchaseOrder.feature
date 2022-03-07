Feature: Purchase Order

  Background:
    Given that user is on the website site hompage

    Scenario: Purchase a faded shirt to cart
      When User clicks on the sign in button
      Then User enters "<email>" address and "<password>"
      Then Move your cursor over women's link
      Then Click on sub menu T-shirts
      Then Mouse hover on the first product displayed
      Then More button will be displayed click on More button
      Then Increase quantity to 5 select size L select color
      Then Click add to cart
      Then Click proceed to checkout
      Then Complete the buy order process till payment
      Then Make sure that Product is ordered

      Example
        |email                    |password               |
        |lanre.ikuesan@gmail.com  |testing                |