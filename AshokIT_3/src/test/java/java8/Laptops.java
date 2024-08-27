package java8;

public class Laptops {

	String name;
	String model;
	String price;

	public Laptops(String name, String model, String price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptops [name=" + name + ", model=" + model + ", price=" + price + "]";
	}

}
