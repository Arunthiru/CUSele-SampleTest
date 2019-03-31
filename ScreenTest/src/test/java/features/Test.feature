@Features
Feature: Random Search Term

@Testing
 Scenario: Login as a authenticated user
    Given user is  on google searchpage
    When user clicks on search field
    And user enters TechBeacon
    Then select the third item from the google search results
