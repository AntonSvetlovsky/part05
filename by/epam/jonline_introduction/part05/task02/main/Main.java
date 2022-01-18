/*
 * Создать класс Payment с внутренним классом, с помощью объектов
 * которого можно сформировать покупку из нескольких товаров.
 */

package by.epam.jonline_introduction.part05.task02.main;

import by.epam.jonline_introduction.part05.task02.entity.Payment;
import by.epam.jonline_introduction.part05.task02.entity.Payment.Product;
import by.epam.jonline_introduction.part05.task02.view.PaymentView;

public class Main {

	public static void main(String[] args) {

		PaymentView view = new PaymentView();

		Product product1 = new Product.Builder("Milk", 2).volume(1).build();
		Product product2 = new Product.Builder("Coffee", 7).weight(0.5).build();
		Product product3 = new Product.Builder("Chicken Eggs", 5).amount(10).build();
		Product product4 = new Product.Builder("Fish", 21).weight(1).build();
		Product product5 = new Product.Builder("Rise", 2.5).weight(0.7).build();

		Payment payment = new Payment();

		payment.addProduct(product1);
		payment.addProduct(product2);
		payment.addProduct(product3);
		payment.addProduct(product4);
		payment.addProduct(product5);

		view.showPayment(payment);

	}

}
