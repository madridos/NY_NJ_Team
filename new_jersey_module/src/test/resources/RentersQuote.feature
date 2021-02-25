Feature:
  Background:
    Given the user Lands in Stat farm home page
    When User click on GET A QUOTE link
    Then User should see a dropdown containing select-product, zip, Start a Quote
    When User enter the product "Renters" , enter a zip code "11372"  and click on Start a Quote
    Then User should see a message "Let’s start with the address"
Scenario: A02:
  Given User enter all information required
    |33-34 77TH ST|
    |QUEENS|
    |NY                 |
    |02/23/2021         |

  When User check the button My mailing address is the same and click continue.
  Then User should land on the next step "Tell us a little about yourself"