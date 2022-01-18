package by.epam.jonline_introduction.part05.task02.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Product> list;
	private final LocalDateTime currentDate;

	{
		currentDate = LocalDateTime.now();
		list = new ArrayList<Product>();
	}

	public Payment() {

	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	public void addProduct(Product product) {
		list.add(product);
	}

	public void removeProduct(Product product) {
		list.remove(product);
	}

	public LocalDateTime getCurrentDate() {
		return currentDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentDate == null) ? 0 : currentDate.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		Payment other = (Payment) obj;
		if (currentDate == null) {
			if (other.currentDate != null) {
				return false;
			}
		} else if (!currentDate.equals(other.currentDate)) {
			return false;
		}
		if (list == null) {
			if (other.list != null) {
				return false;
			}
		} else if (!list.equals(other.list)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Payment [list=" + list + ", currentDate=" + currentDate + "]";
	}

	public static class Product {

		private final String name;
		private final double price;
		private final double weight;
		private final double volume;
		private final int amount;

		private Product(Builder builder) {
			this.name = builder.name;
			this.price = builder.price;
			this.weight = builder.weight;
			this.volume = builder.volume;
			this.amount = builder.amount;
		}

		public String getName() {
			return name;
		}

		public double getPrice() {
			return price;
		}

		public double getWeight() {
			return weight;
		}

		public double getVolume() {
			return volume;
		}

		public int getAmount() {
			return amount;
		}

		public static class Builder {
			private final String name;
			private final double price;
			private double weight;
			private double volume;
			private int amount;

			public Builder(String name, double price) {
				this.name = name;
				this.price = price;
			}

			public Builder weight(double weight) {
				this.weight = weight;
				return this;
			}

			public Builder volume(double volume) {
				this.volume = volume;
				return this;
			}

			public Builder amount(int amount) {
				this.amount = amount;
				return this;
			}

			public Product build() {
				return new Product(this);
			}
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + amount;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(volume);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(weight);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			Product other = (Product) obj;
			if (amount != other.amount) {
				return false;
			}
			if (name == null) {
				if (other.name != null) {
					return false;
				}
			} else if (!name.equals(other.name)) {
				return false;
			}
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
				return false;
			}
			if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume)) {
				return false;
			}
			if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight)) {
				return false;
			}
			return true;
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + ", weight=" + weight + ", volume=" + volume
					+ ", amount=" + amount + "]";
		}

	}
}
