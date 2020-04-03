Feature: Initial page

@Smoke
 Scenario: As a web user i want to navigate PHPTravels "About us" page
   Given The user is in home page
   When The user goes to about us page
   Then The About us page is displayed