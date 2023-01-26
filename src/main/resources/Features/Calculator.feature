Feature: Calculator

  As a user
  I want to use a calculator to add numbers
  So that I don't need add myself

  Scenario Outline: Add two number <num1> & <num2>
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <total>

    Examples:
    |num1|num2|total|
    |   2 |   5 |   7  |
    |   10 |  -5  |   5  |
    | 99   | 1  |   100  |