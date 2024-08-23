@Qris
Feature: Qris

  @positive-test
  Scenario: User can show qr code to receive money
    Given user already in homepage
    When user click qris button
    Then the qr code appears on screen