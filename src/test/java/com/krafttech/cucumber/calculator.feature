Feature: Calculator Tests

  Scenario: Sum of several numbers
    Given The user is on the start page
    When The user sum of following numbers
    |9|
    |6|
    |3|
    Then The result should be 18