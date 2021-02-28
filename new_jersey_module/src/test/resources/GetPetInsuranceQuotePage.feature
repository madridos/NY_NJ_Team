Feature: Get a Pet Insurance Quote

  Background:
    Given user is on state farm home page and should see their title displayed ""
    When user clicks on "INSURANCE" on the page header bar menu
    When user clicks on "PET MEDICAL" link
    Then user should land on "Pet Insurance - Get a Cat or Dog Insurance Quote - State Farm®" page
  Scenario: m1 enter the zip code and land in the Get a Pet Insurance Quote Page
    Given user enter zip code "11204"
    When user click on the start quote button
    Then user should see text "Get A Pet Insurance Quote"
    And user enter required feild information
      | said       |
      | dahdouh    |
      | 2006 72 st |
      | 2f         |
    Then user click on continue

