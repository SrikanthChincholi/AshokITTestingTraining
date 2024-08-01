package collectionprgms;

public class Laptops {
	
	String name;
	String price;
	String model;
	
	public Laptops(String name, String price, String model) {
		super();
		this.name = name;
		this.price = price;
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptops [name=" + name + ", price=" + price + ", model=" + model + "]";
	}
	
	
	
	

}
