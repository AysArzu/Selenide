Feature: alerts
  Scenario: TC01 Alerts
    Given User go to "https://testcenter.techproeducation.com/index.php?page=javascript-alerts"
    And click alert promt
    And user send text "hello"
    Then confirm that the user's input contains the word "hello"
