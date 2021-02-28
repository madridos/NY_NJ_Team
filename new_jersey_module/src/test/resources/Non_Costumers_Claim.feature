Feature:State Farm Claim center
  In order to test claim page of state farm
  As a non registered user
  I want to specify the features af claim

  Background:aghiles 00 State Farm Claims section
    Given user is on state farm home page and should see their title displayed ""
    When user clicks on "CLAIMS" on the page header bar menu
    Then drop down menu section containing "State Farm Claims","Claims Help Center" and "Roadside Assistance" should appear
    When user clicks on "State Farm Claims" link
    Then user should land on "State Farm® Claims - File a Claim, Manage a Claim - State Farm®" page
  Scenario: Aghiles 02:test Claims for non-customers
    When user clicks on Claims for non-customers link text
    Then user should see "File A Loss" page
    And  user clicks on individual function
    Then a calendar and drop down fields appear
    When user enters a date
    And  hours and minutes and period of day
    Then user should see a continue button and click on it
    And  a filed with last name request should be displayed
    When user enters a last name and clicks on enter
    Then another field of policy number should be displayed
    And  user should enter his state farm policy number and clicks on enter











