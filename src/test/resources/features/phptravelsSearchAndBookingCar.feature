Feature: Initial page

@Test
 Scenario: As a web user I want to navigate PHPTravel and search a Car between two days.
   Given The user is in Cars page
   When The user search a car betwteen two days
   Then The search page list the available cars in those days.

@Test
 Scenario: As a web user I want to navigate PHPTravel and complete a cars booking process
   Given The user is in Cars page
   When the user search a car between two days
   And  the user select the first result in the list
   And The user complete the booking car form
   And The user complete the payment form <payment data provided below>
   Then a reservation number is provided

"""
Credit card: Visa
Number: 4263982640269299
Exp Date: 02/2023
CVV: 837
"""