Feature:Select a product  to get started withe a Quote Auto

  Background:AMD 01 State Farm GET A QUOTE section
    Given user is on state farm home page and should see their title displayed ""
    When user clicks on "GET A QUOTE" on the page header bar menu
   Then User should see a dropdown containing select-product, zip, Start a Quote
    When User enter the product "Auto" , enter a zip code "11372"  and click on Start a Quote
    Then User should see a message "Get your quote in a few minutes"

  Scenario: AM02 fill up the first step
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
#    Then User should see the next form "Vehicles_nextForm"
#    Given user is on state farm home page and should see their title displayed ""
#    When user clicks on "GET A QUOTE" on the page header bar menu
#    Then User should see a dropdown containing select-product, zip, Start a Quote
#    When User enter the product "Auto" , enter a zip code "11372"  and click on Start a Quote
#    Then User should see a message "Get your quote in a few minutes"
