Feature: Google Search

@OpenBrowser
Scenario: Open browser

Given I am able to open browser as "chrome"
When I enter the URL as "http://www.amazon.co.in"
Then Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
