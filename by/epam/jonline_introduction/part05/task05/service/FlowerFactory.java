package by.epam.jonline_introduction.part05.task05.service;

import by.epam.jonline_introduction.part05.task05.bean.Color;
import by.epam.jonline_introduction.part05.task05.bean.Flower;
import by.epam.jonline_introduction.part05.task05.bean.FlowerType;

public interface FlowerFactory {

	Flower createFlower(FlowerType type, Color color);
}
