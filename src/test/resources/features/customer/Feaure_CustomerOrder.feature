Author: Belal Chowdhury
Feature: Customer Order
User Story: NGAS-234
Scenario: scenario 1 title
Scenario: scenario 2 title
Scenario: scenario 3 tile

Feature: Customer orders functionality
  As a Customer
  I want to See my Orders
  So that I can manage my Orders

  Scenario: Customer Order total count Test
    Given I logged in as Customer
    |userId         |password|
    |david@gmail.com|1234    |
    When Click on Order List Menu
    And Verify Total Order count is greater than 100