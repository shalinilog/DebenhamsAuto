Feature: Validate login

  Scenario: Validate login with valid email address and password

    Given I am on the login page "https://www.debenhams.com"
    When I enter valid email address "shalukanna@yahoo.co.uk"
    When I enter vaild password "Thought1"
    When I click on sign in button
    Then I should be able to view My Account page

