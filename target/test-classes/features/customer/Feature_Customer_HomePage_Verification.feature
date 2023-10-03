Feature: MicrotechNa Home Page Verification
  As a customer
  I want to know the home page
  so that i can verify i am in home page
  @smoke
  Scenario: Verify MicrotechNa Home Page
    Given I am in landing page http://it.microtechlimited.com
    Then I verify MicrotechNa logo
    And I also verify welcome message