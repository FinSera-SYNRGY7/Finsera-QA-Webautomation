@Mutasi
Feature: Mutasi Rekening

  @positive-test
  Scenario: User can download the monthly mutasi rekening
    Given user already in homepage
    And user click mutasi button
    When user click monthly button
    Then user downloaded the mutasi