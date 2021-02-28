Feature: File a claim for costumers
  In order to test file a claim
  As a costumer
  I have to specify the features of file a claim
  Background:aghiles 00 State Farm Claims section
    Given user is on state farm home page and should see their title displayed ""
    When user clicks on "CLAIMS" on the page header bar menu
    Then drop down menu section containing "State Farm Claims","Claims Help Center" and "Roadside Assistance" should appear
    When user clicks on "State Farm Claims" link
    Then user should land on "State Farm® Claims - File a Claim, Manage a Claim - State Farm®" page
  Scenario: aghiles 01 file a claim for costumers for Auto &Motorcycle
    When costumers click on "file a claim"
    And  select "Auto & Motorcycle
    Then a start option should be displayed and click to start
    When you select a state farm costumer
    And  press continue button
    Then a login field should appear
    When costumers enter user id
    And  costumers enter password
    And  click on log in
    Then a welcome home page for costumers should appear


