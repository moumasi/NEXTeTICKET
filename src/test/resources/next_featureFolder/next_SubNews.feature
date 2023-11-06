Feature: This is a information feature


@tag1
Scenario: Verify Subscribe To Newsletter is available in Home page footer
Given Open <"Url"> NWEXTeTICKET 
Then  Scrolldown page until SUBSCRIBE to NEWSLETTER
Then  Verify SUBSCRIBE to NEWSLETTER is available in home page footer


@tag2
Scenario: Verify Email field is added under the  SUBSCRIBE to NEWSLETTER 
Given Open <"Url"> NWEXTeTICKET 
Then  Scrolldown page until SUBSCRIBE to NEWSLETTER
Then  Verify Email field is added under the SUBSCRIBE to NEWSLETTER


@tag3
Scenario: Verify Send Button is added under the  SUBSCRIBE to NEWSLETTER 
Given Open <"Url"> NWEXTeTICKET 
Then  Scrolldown page until SUBSCRIBE to NEWSLETTER
Then  Verify Send Button is added under the SUBSCRIBE to NEWSLETTER


@tag4
Scenario: Verify success message is appear when sent with email
Given Open <"Url"> NWEXTeTICKET 
Then  Scrolldown page until SUBSCRIBE to NEWSLETTER
Then  Type valid email and click send button
Then  Verify success message is appear when sent with email


@tag5
Scenario: Verify error message is appear when sent without email
Given Open <"Url"> NWEXTeTICKET 
Then  Scrolldown page until SUBSCRIBE to NEWSLETTER
Then  Leave blank email field and click send button
Then  Verify error message is appear when sent without email











