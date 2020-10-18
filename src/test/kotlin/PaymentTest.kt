package io.cucumber.kotlin

import PaymentData
import PaymentProcessor
import io.cucumber.java8.En
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue

class PaymentTest : En {
	init {

		val payment: PaymentData = PaymentData()
		val paymentProcessor: PaymentProcessor = PaymentProcessor()
		When("I try pay with {int} installments") { installments : Int  ->
			payment.installments = installments
		}

		Given("{int} installment available") { installments : Int  ->
			paymentProcessor.availableInstallments = installments
		}

		Given("I have a {word} card") { cardType : String  ->
			payment.cardType = cardType
		}

		Then("I process the payment successfully") {
			assertTrue(paymentProcessor.process(payment))
		}

		Then("I cannot process the payment") {
			assertFalse(paymentProcessor.process(payment))
		}

	}
}
