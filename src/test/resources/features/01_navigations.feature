@google
Feature: Navigations
  Scenario: TC 01 Navigation Test
    Given User go to "https://www.google.com/"
    Given User go to "https://www.amazon.com/"
    And wait 5 seconds
    Then go back to the previous page
    Then go to the next page
    Then refresh the page
    Then keep the page open