Feature:Select a product  to get started withe a Quote Renters
  Background:AMD 01 State Farm GET A QUOTE section
    Given user is on state farm home page and should see their title displayed ""
    When user clicks on "GET A QUOTE" on the page header bar menu
    Then User should see a dropdown containing select-product, zip, Start a Quote
    When User enter the product "Renters" , enter a zip code "11372"  and click on Start a Quote
    Then User should see a welcome message "Let’s start with the address"
Scenario: AM02 fill up the first step
  Given User enter all information required
    |33-34 77TH ST|
    |QUEENS|
    |NY                 |
    |11372 |
    |02/23/2021         |

  When User check the button My mailing address is the same and click continue.
  Then User should land on the next step "Continue"