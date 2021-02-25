Feature: Pet Insurance From State Farm and Trupanion
  Scenario: m1 navigate and land in PET MEDICAL Page
    When user click on insurance button
    Then user should see drop down contains "PET MEDICAL"
    And user click on PET MEDICAL link
    Then user should land on PET MEDICAL Page


