Feature: Get a Pet Insurance Quote

  Background:
    When user click on insurance button
    And user click on PET MEDICAL link
  Scenario: m1 enter the zip code and land in the Get a Pet Insurance Quote Page
    Given user enter zip code "11204"
    When user click on the start quote button
    Then user should see text "Get A Pet Insurance Quote"
    And user enter required feild information
    |said|
    |dahdouh|
    |2006 72 st|
    |2f|
    Then user click on continue


