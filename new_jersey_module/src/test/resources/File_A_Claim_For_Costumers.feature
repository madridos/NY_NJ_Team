Feature: File a claim for costumers
  In order to test file a claim
  As a costumer
  I have to specify the features of file a claim
  Background:
    Given user landed on state farm home page
    When  user clicks on CLAIMS on the page header bar menu
    Then  drop down menu section containing "State Farm Claims","Claims Help Center" and "Roadside Assistance" should appear
    When  user clicks on "State Farm Claims"
  Scenario: aghiles 00 file a claim for costumers for Auto &Motorcycle
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


