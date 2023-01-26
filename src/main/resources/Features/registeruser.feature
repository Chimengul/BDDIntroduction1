Feature: register a new account

  Scenario: register multiple users
    Given user is on the register page
    When user fill out the registration form
    |Gender|FName|LName|Day|Month|Year|Email|Pass|
    |    Male  |James     | Harden    | 19  | January    |1990    | j.harden@yahoo.com    |   Test1234 |
    And click on register button on the page
    Then a new account should be created

  Scenario Outline: create multiple users account
    Given user is on the register page
    When user enters"<Gender>","<FName>","<LName>","<Day>","<Month>","<Year>","<Email>","<Pass>>",
 And click on register button on the page
    Then  a new account should be created

    Examples:
      |Gender|FName|LName|Day|Month|Year|Email|Pass|
      |    Male  |James     | Harden    | 19  | January    |1990    | j.harden@yahoo.com    |   Test1234 |