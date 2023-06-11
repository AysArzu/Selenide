@iframe
Feature: iframe windows

  Scenario:TC01 iframe and window
    Given User go to "https://testcenter.techproeducation.com/index.php?page=iframe"
    And switch to frame 1
    And user click  back to techproeducation.com button
    And switch to window 2
    Then keep the page open


