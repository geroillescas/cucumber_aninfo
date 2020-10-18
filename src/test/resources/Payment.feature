Feature: Payment

  Scenario: payment with CREDIT card and 1 installment
    Given I have a CREDIT card
	And 12 installment available
	When I try pay with 1 installments
    Then I process the payment successfully

  Scenario: payment with CREDIT card and 12 installment
    Given I have a CREDIT carddd
	And 12 installment available
	When I try pay with 12 installments
	Then I process the payment successfully

  Scenario: payment with DEBIT card and 1 installment
	Given I have a DEBIT card
	And 1 installment available
	When I try pay with 1 installments
	Then I process the payment successfully

  Scenario: payment with DEBIT card and 12 installment
	Given I have a DEBIT card
	And 1 installment available
	When I try pay with 12 installments
	Then I cannot process the payment
