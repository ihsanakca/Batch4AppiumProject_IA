Feature: Open a web site

  Scenario: Kraft Login Test
    Given The user is on the login page
    When The user enters following credentials and press login button
      | email    | mgezer@gmail.com |
      | password | Mg12345678       |
    Then The user should be able to see own full name: "Melih Gezer" at the dashboard page
    And The user closes the browser