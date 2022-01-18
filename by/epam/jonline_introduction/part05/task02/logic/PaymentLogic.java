package by.epam.jonline_introduction.part05.task02.logic;

import by.epam.jonline_introduction.part05.task02.entity.Payment;
import by.epam.jonline_introduction.part05.task02.entity.Payment.Product;

public class PaymentLogic {

	public double calculateTotalPrice(Payment payment) {
		double totalPrice = 0;

		for (Product product : payment.getList()) {
			totalPrice += product.getPrice();
		}

		return totalPrice;
	}
}
