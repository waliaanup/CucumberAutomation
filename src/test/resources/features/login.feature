@login
Feature: Test the forgot Password Page
  @123
  Scenario: Validate User Should be able to change the password
    Given open the url
    When User is entering the valid credentials
    And Click the login button
    Then User should be able to login in the home page
@loginpage
  Scenario: Validate User Should not be able to change the password
    Given open the url
    When User is entering the invalid credentials
    And Click the login button
    Then User should not be able to login in the home page

  Scenario: Validate User Should not be able to login home page with invalid credentials
    Given open the url
    When User is entering the invalid credentials
    And Click the login button
    Then User should not be able to login in the home page

