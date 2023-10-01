Feature: Employee Login Functionality
  As an employee
  I want to login my account
  So that i can verify this is employee login homepage
  Scenario Outline:
    Given I am in landing page http://it.microtechlimited.com
    When I Click on Login menu
    And I Click in Customer Login Menu
    Then I enter employee user id as "<userId>"
    And I enter employee password as "<password>"
    Then I Click on Login Button
    And I verify I am in employee home page
    Examples:
      | userId              | password |
      |testpilot@gmail.com  |1234|