package comparator_interface;

public class LaptopDetails {

	String model;
	String price;
	String brand;

	public LaptopDetails(String model, String price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "LaptopDetails [model=" + model + ", price=" + price + ", brand=" + brand + "]";
	}

}
