Feature:State Farm CLAIMS

  Scenario:aghiles 01 State Farm Claims section
    Given user landed on state farm home page
    When  user clicks on CLAIMS on the page header bar menu
    Then  drop down menu section containing "State Farm Claims","Claims Help Center" and "Roadside Assistance" should appear
    When  user clicks on "State Farm Claims"
    Then  user should land on "Welcome to our easy claims center"
