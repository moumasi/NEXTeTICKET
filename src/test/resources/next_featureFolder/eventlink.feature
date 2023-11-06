
Feature: This is event link functionality

@tag15
Scenario: Verify event link is display in home page header
Given Open <"Url"> NWEXTeTICKET 
Then  Verify event Link is display in home page header

@tag16
Scenario: Verify event link text color is WHITE
Given Open <"Url"> NWEXTeTICKET 
Then  Verify event Link text color is WHITE

@tag17
Scenario: Verify event page is appear
Given Open <"Url"> NWEXTeTICKET 
Then Click on event link
Then Verify event page is appear





















