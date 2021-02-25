Feature: Get a Pet Insurance Quote

  Background:
    Given the user Lands in Stat farm home page
    When user click on insurance button
    Then user should see drop down contains "PET MEDICAL"
    And user click on PET MEDICAL link

  Scenario: m1 navigate and land in PET MEDICAL Page
    Then user should land on PET MEDICAL Page

  Scenario: m1 enter the zip code and land in the Get a Pet Insurance Quote Page
    When user click on the start quote button
    Then user should see text Get A Pet Insurance Quote
    And user enter the first name
    And user enter the last name
    And user enter the street adress
    And user enter the apartment nbr
    And user enter the last name
    Then user should click on continue
