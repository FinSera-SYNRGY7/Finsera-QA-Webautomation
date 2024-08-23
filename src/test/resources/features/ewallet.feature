@Ewallet
Feature: E-Wallet

  @positive-test
  Scenario: User should be able to make e-wallet transfer via ShopeePay
    Given user already in homepage
    And user click ewallet button
    And user click tambah penerima baru button
    And user is on the e-wallet selection page
    And user select shopeePay
    And user input nomor telfon with "085754237890"
    And user input nominal with "12000"
    And user input catatan with "test"
    When user input valid payment pin
    Then user successfully transfer money
