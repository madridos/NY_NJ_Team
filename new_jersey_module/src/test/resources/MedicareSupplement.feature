Feature: Medicare Supplement
Background:
  Given the user launch the browser
  And enter the state farm "URL" into a web browser.
  Then state farm home Page appears
  When user click on INSURANCE link on hom Page
  And he clicks on Medicare Supplement
  Then Medicare Supplement page appears

  Scenario:Sen-01 scroll To Element
    Given user on Medicare Supplement scroll To Find an Agent Element
    Then enter "Zip code" into zip code field
    When he clicks on go button a Find a State Farm Agent Near You page should appaers

  Scenario Outline:Sen-02 Learn about Medicare Supplement Insurance by stats
    Given user select a "<statSelected>" And click on Go button
    Then Medicare Supplement Insurance — "<statPage>" page should appears
    Examples:
      |statSelected  |statPage|
      |Albama        |Albama  |
      |Alaska        |Alaska  |

  Scenario:Sen-03 change-a-health-policy link verification
    Given user on Medicare Supplement scroll To Find an Agent change-a-health-policy link verification link
    When he clicks on that link
    Then a Health Policy page appaers

  Scenario:Sen-04 scolDown and click on Contact your agent_insurance producer link
    Given user on Medicare Supplement scroll To Find Contact your agent_insurance producer link
    When he clicks on that Link.
    Then a Find a State Farm Agent Near You appaers

  Scenario:Sen-05 verify insurance link
    Given user on Medicare Supplement click on insurance link
    Then a Get great insurance and a great value appaers