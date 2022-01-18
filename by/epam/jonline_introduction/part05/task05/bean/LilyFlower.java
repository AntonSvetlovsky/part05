package by.epam.jonline_introduction.part05.task05.bean;

public class LilyFlower implements Flower {

	private Color color;

	public LilyFlower() {
	}

	public LilyFlower(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		LilyFlower other = (LilyFlower) obj;
		if (color != other.color) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return color + " Lily";
	}

}
