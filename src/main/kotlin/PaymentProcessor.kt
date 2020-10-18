class PaymentProcessor() {
	var availableInstallments: Int = 12
	fun process(paymentData: PaymentData) : Boolean {
		return when (paymentData.cardType) {
			"DEBIT" -> paymentData.installments == 1
			"CREDIT" -> paymentData.installments <= availableInstallments
			else -> false
		}
	}
}
