Feature:Health Insurance
  Background:
    Given user is on state farm home page
    When user clicks on insurance link
    Then user should see a dropdown contains "HEALTH"
    And user click on HEALTH link
Scenario: navigate and land in state farm health page
  Then user should land on HEALTH page
  Scenario:user should enter zip code
    When user enters zip code
    And user clicks on find agent
    Then user should land find agent near you


