Feature: Pet Insurance From State Farm and Trupanion
  Background: m1 navigate and land in PET MEDICAL Page
    Given user is on state farm home page and should see their title displayed ""
    When user clicks on "INSURANCE" on the page header bar menu
    When user clicks on "PET MEDICAL" link
    Then user should land on "Term Life Insurance - Get A Quote - State Farm®" page
  Scenario: m2 navigate and land in PET MEDICAL Page
    When user scrolls down to the footer page
    And user click on the link "Term Life Insurance"
    Then user should land on "Term Life Insurance" page
