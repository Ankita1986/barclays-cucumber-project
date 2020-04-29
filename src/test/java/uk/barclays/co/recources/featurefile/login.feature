#Feature: Login page feature
#  As a user I want to navigate to login page into barclays website
#
#  Scenario: User should navigate to login page successfully
#    Given I am on home page
#    When I click on login link
#    Then I should navigate to page successfully
#
#  Scenario: User should not login without entering membership details
#    Given I am on home page
#    When I click on login link
#    And I enter surname "Kaswala"
#    And I click on next step
#    Then I should see the error Message
