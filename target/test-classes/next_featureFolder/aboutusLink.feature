
Feature: This is about us link functionality


@tag9
Scenario: Verify About Us Link is in Home page header
Given Open <"Url"> NWEXTeTICKET
Then  Verify About Us Link is in home page header

@tag10
Scenario: Verify aboutus link text color is WHITE
Given Open <"Url"> NWEXTeTICKET 
Then  Verify aboutus link text color is WHITE

@tag11
Scenario: Verify aboutus page is appear
Given Open <"Url"> NWEXTeTICKET 
Then Click on about us link
Then Verify aboutus page is appear


















