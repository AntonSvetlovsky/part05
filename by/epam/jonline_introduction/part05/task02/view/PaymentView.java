package by.epam.jonline_introduction.part05.task02.view;

import by.epam.jonline_introduction.part05.task02.entity.Payment;
import by.epam.jonline_introduction.part05.task02.entity.Payment.Product;
import by.epam.jonline_introduction.part05.task02.logic.PaymentLogic;

public class PaymentView {

	public void showPayment(Payment payment) {

		PaymentLogic logic = new PaymentLogic();

		System.out.println("DATE: " + payment.getCurrentDate());
		System.out.println();
		System.out.printf("%16s%24s%8s", "PRODUCT", "PROPERTIES", "PRICE");
		for (Product product : payment.getList()) {

			String otherProperties = "";
			if (product.getAmount() != 0) {
				otherProperties += product.getAmount() + " pieces, ";
			}
			if (product.getVolume() != 0) {
				otherProperties += product.getVolume() + " l, ";
			}
			if (product.getWeight() != 0) {
				otherProperties += product.getWeight() + " kg, ";
			}

			System.out.println();
			System.out.printf("%16s%24s%8.2f", product.getName(), otherProperties, product.getPrice());
		}

		System.out.println("\n");
		System.out.printf("%40s%8.2f", "TOTAL PRICE", logic.calculateTotalPrice(payment));

	}
}
