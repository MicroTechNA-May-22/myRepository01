Feature: Customer orders functionality
  As a Customer
  I want to See my Orders
  So that I can manage my Orders
@smoke
  Scenario: Customer Order total count Test
    Given I logged in as Customer
    |userId         |password|
    |david@gmail.com|1234    |
    When Click on Order List Menu
    And Verify Total Order count is greater than 100