@TransferAntarBank
Feature: Transfer Antar Bank

  @positive-test
  Scenario: User should be able to make cross-bank transfers with a valid pin
    Given user already in homepage
    And user click tranfer antar bank button
    And user click tambah penerima baru button
    And user select bank BRI
    And user input nomor rekening with "789012345"
    And user input nominal with "12000"
    And user input catatan with "test"
    When user input valid payment pin
    Then user successfully transfer money
