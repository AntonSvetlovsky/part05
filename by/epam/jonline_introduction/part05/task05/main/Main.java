/*
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Корректно спроектируйте и реализуйте предметную область задачи.
 * Для создания объектов из иерархии классов продумайте возможность
 * использования порождающих шаблонов проектирования.
 * Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * Для проверки корректности переданных данных можно применить регулярные выражения.
 * Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 *
 * Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные
 * композиции (объект, представляющий собой цветочную композицию). Составляющими
 * цветочной композиции являются цветы и упаковка.
 */

package by.epam.jonline_introduction.part05.task05.main;

import by.epam.jonline_introduction.part05.task05.bean.FlowerComposition;
import by.epam.jonline_introduction.part05.task05.service.FlowerStore;
import by.epam.jonline_introduction.part05.task05.service.FlowerStoreProvider;

public class Main {

	private final static FlowerStoreProvider flowerStoreProvider = FlowerStoreProvider.getInstance();
	private final static FlowerStore flowerStore = flowerStoreProvider.getFactory();

	public static void main(String[] args) {

		String request = "daisy white 2, rose pink 2, lily white 1; cellophane pink";

		FlowerComposition composition = flowerStore.createFlowerComposition(request);
		if (composition != null) {
			System.out.println(composition.toString());
		} else {
			System.err.println("Error");
		}

	}

}
