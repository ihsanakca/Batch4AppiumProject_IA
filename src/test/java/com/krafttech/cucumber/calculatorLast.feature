Feature: Calculator Tests

  @wip
  Scenario: Sum of several number in calculator
    Given The user is on the start page
    When The user sum of following numbers
      | 1 |
      | 2 |
      | 5 |
      | 3 |
      | 8 |
      | 5 |
    Then The result should be 24