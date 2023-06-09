@locators
Feature: locators

  Scenario: TC01 locators
    Given User go to "https://testcenter.techproeducation.com/index.php?page=form-authentication"
    And wait 3 seconds
    And enter the username
    And wait 3 seconds
    And Enter your password
    And wait 3 seconds
    When Click submit button
    And wait 3 seconds
    Then Assert login in