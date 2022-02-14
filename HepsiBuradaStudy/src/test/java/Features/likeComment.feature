#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Like Comment on Products Detail

Scenario: User like a comment on a product detail page
    Given User is on "https://www.hepsiburada.com/"
    When User search a product
    And User select a product
    And User click "Degerlendirmeler" tab
    And User click "Evet" button for first comment
    Then User should be check message
    And Close browser
    