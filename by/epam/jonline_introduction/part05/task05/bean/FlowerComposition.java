package by.epam.jonline_introduction.part05.task05.bean;

import java.util.ArrayList;
import java.util.List;

public class FlowerComposition {

	Wrapper wrapper;
	List<Flower> flowers;

	{
		flowers = new ArrayList<Flower>();
	}

	public FlowerComposition() {
	}

	public FlowerComposition(Wrapper wrapper, List<Flower> flowers) {
		this.wrapper = wrapper;
		this.flowers = flowers;
	}

	@Override
	public String toString() {
		return "FlowerComposition [wrapper=" + wrapper + ", flowers=" + flowers + "]";
	}

}
