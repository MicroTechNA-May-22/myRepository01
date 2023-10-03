Feature: Customer Order
Scenario: scenario 1 title

Feature: Create Order Opearations
@smoke
	Scenario: Create Order by Customer
		Given I logged in as Customer
    |userId         |password|
    |david@gmail.com|1234    |		
		Then I click on Order Product menu
		Then Select Product name
		And Enter Order Date
		And Click Order Product button
		And Click Confirm Order
		Then Verify Order Status is Confirmed