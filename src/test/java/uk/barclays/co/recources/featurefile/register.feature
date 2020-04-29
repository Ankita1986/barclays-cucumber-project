@Register
Feature: Register page feature
  As a user I want to navigate to Registration page into barclays website

  Scenario: User should navigate to registration page successfully
    Given I am on home page
    When I click on Register link
    Then I should navigate to register page successfully

  Scenario: User should navigate to user details page successfully
    Given I am on home page
    When I click on Register link
    And I click on start button
    Then I should navigate to your details page successfully
