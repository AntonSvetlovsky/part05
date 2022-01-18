package by.epam.jonline_introduction.part05.task05.service;

import by.epam.jonline_introduction.part05.task05.bean.Color;
import by.epam.jonline_introduction.part05.task05.bean.Wrapper;
import by.epam.jonline_introduction.part05.task05.bean.WrapperType;

public interface WrapperFactory {

	Wrapper createWrapper(WrapperType type, Color color);
}
