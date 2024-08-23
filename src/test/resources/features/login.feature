@Login
Feature: Login

  @positive-test
  Scenario: Login using valid username and valid password
    Given user is on login page
    And user input username with "johndoe"
    And user input password with "password123"
    And user click login button
    When user create app lock pin
    Then user is on homepage

