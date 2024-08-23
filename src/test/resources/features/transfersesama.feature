@TransferSesamaBank
Feature: Transfer Sesama Bank

  @positive-test
  Scenario: User should be able to make same-bank transfers with a valid pin
    Given user already in homepage
    And user click tranfer sesama bank button
    And user click tambah penerima baru button
    And user input nomor rekening with "987654321"
    And user input nominal with "12000"
    And user input catatan with "test"
    When user input valid payment pin
    Then user successfully transfer money
