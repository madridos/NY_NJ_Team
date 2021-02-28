Feature:

  Scenario: test 01 get to the home page
    Given user is on state farm home page and should see their title displayed ""

  Scenario:test 02 State Farm Claims section
    When user clicks on "CLAIMS" on the page header bar menu
    Then drop down menu section containing "State Farm Claims","Claims Help Center" and "Roadside Assistance" should appear
    When user clicks on "State Farm Claims" link
    Then user should land on "State Farm® Claims - File a Claim, Manage a Claim - State Farm®" page