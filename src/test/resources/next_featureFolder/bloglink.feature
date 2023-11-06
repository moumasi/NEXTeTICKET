
Feature: This is event link functionality

@tag18
Scenario: Verify Blog link is display in home page header
Given Open <"Url"> NWEXTeTICKET 
Then  Verify Blog Link is display in home page header

@tag19
Scenario: Verify Blog link text color is WHITE
Given Open <"Url"> NWEXTeTICKET 
Then  Verify Blog Link text color is WHITE

@tag20
Scenario: Verify blog page is appear
Given Open <"Url"> NWEXTeTICKET 
Then Click on Blog link
Then Verify blog page is appear























