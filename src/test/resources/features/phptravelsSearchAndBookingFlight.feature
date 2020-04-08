Feature: Initial page

@Ignore
 Scenario: As a web user I want to navigate PHPTravel and search a Flight between two days.
   Given The user is in home page
   When The user search a flight betwteen two days
   Then The search page list the available flights in those days

@Smoke
 Scenario: As a web user I want to navigate PHPTravel and complete a cars booking process
   Given The user is in home page
   When The user search a flight betwteen two days 
   And The user select the first result in the list
   And The user complete the booking flight form
   And The user complete the payment form <payment data provided below>
   Then a reservation number is provided

"""
Credit card: Visa
Number: 4263982640269299
Exp Date: 02/2023
CVV: 837
"""