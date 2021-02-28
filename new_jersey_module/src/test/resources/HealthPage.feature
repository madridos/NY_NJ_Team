Feature:Health Insurance
  Background: Nourd 01 get to the home page
    Given user is on state farm home page and should see their title displayed ""
    When user clicks on "INSURANCE" on the page header bar menu
    When user clicks on "HEALTH" link
    Then user should land on "Health Insurance - State Farm®" page

  Scenario:Nourd 01 user should enter zip code
    When user enters zip code
    And user clicks on find agent
    Then user should land find agent near you


