Feature: Initial page

@Test
 Scenario: As a web user i want to navigate PHPTravels "About us" page
   Given The user is in home page
   When The user go to "About us" page
   Then The "About us" page is displayed