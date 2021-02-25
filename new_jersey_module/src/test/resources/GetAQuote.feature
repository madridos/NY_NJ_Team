Feature:Select a product to get started withe a Quote

  Background:
    Given the user Lands in Stat farm home page
    When User click on GET A QUOTE link
    Then User should see a dropdown containing select-product, zip, Start a Quote
    When User enter the product "Auto" , enter a zip code "11372"  and click on Start a Quote
    Then User should see a message "Get your quote in a few minutes"

  Scenario: A01 fill up the first step
    Given User enter all Indicates required field
    |Amar|
    |Djebra|
    |3334 77th St Apt 3A|
    |Jackson Hts|
    |NY|
    |11372-1217|
    |09/19/1983|
    |02/23/2021|
    When User click on next Vehicles button
    Then User should see the next form "Vehicles_nextForm"

#  Scenario: A02:
#    Given User enter all information required
#      |33-34 77TH ST|
#      |QUEENS|
#      |NY                 |
#      |02/23/2021         |
#
#    When User check the button My mailing address is the same and click continue.
#    Then User should land on the next step "Tell us a little about yourself"