@Infosaldo
Feature: Info Saldo

  @positive-test
  Scenario: User can check their money balance
    Given user already in homepage
    When user click info saldo button
    Then user's balance appears on screen
