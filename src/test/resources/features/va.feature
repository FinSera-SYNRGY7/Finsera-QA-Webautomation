@VirtualAccount
Feature: Virtual Account

  @positive-test
  Scenario: User can transfer  virtual account using valid pin
    Given user already in homepage
    And user click virtual acount number
    And user click tambah penerima baru button
    And user input valid virtual account with "543216789"
    And user click lanjut button
    When user input valid payment pin
    Then user successfully transfer money
