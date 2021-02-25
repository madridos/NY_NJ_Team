Feature: homepage
  Background:
  Scenario: HP-01 launch & navigate to the home page
  Given user launch browser "firefox"
  When user enter the state farm url "https://www.statefarm.com"
  Then user should land on the state farm home page

  Scenario: hp-02 insurance button clickable and the drop down
    Given user click on insurance button
    Then user should see drop down contains "PET MEDICAL"



