Feature: Term Life Insurance Offers an Affordable Option
  Background:
    Given user is on state farm home page and should see their title displayed ""
    When user clicks on "INSURANCE" on the page header bar menu
    When user clicks on "Term Life" link
    Then user should land on "Term Life Insurance - Get A Quote - State Farm®" page

  Scenario: K02:Get an Online Select Term Life Quote
    Given the user scrolls down in the Term Life Insurance page
    When  the user see the "Get a quote for term life insurance" text
    Then  the user select "NY" from the dropdown menu
    When  the user clicks on the GO button
    Then  the user should land on "Term Life Insurance - Get A Quote - State Farm®"
  Scenario: K03:Comparing Term Life Choices
    Given the user scrolls down in the Term Life Insurance page to Term Life Choices table
    When  the user gets to Comparing Term Life Choices table
    Then  the user should see "Comparing"
  Scenario: K04:Comparing Term to Permanent Insurance
    Given the user scrolls down in the Term Life Insurance page to Comparing Term to Permanent Insurance
    When  the user gets to the table
    Then  the user should see the Term Life and Permanent Life like shown in the below table
    |Provides coverage for a limited time period (term), if premiums are paid.|
    |Provides lifetime coverage, if premiums are paid.|
    |Provides a death benefit, but typically no cash value.                   |
    |Cash value accumulates over time and creates an asset which may be used during your lifetime. 1|
    |Initially, less expensive form of life insurance.                        |
    | Level premiums.|
    |May be renewable or convertible.                                         |
    |Some types of permanent insurance offer flexible premium payments and level or increasing death benefit options.|
#   Scenario Outline: K05: Check the list of links in: Want to Know More About Insurance?
#     Given the user scrolled down to "Get a quote for term life insurance" text
#     When  the user enters "<State_Initials>" in the in the State text_field
#     And   the user clicks on the "Start Quote" button
#     Then  the user should see the "Let's Get Started" when landing in the new page
#     Examples:
#     |State_Initials|
#     |NY|
#     |AL|
#     |KY|
#     |NJ|
#     |TX|


