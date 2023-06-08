package entitites;

public class ProductConstructors {
	
	private String name;
	private double price;
	private int quantity;

	public ProductConstructors(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	
	public double totalValueInStok() {

		return this.quantity * price;
	}

	public void addProduct(int add) {

		this.quantity += add;

	}

	public void removProduct(int out) {

		this.quantity -= out;
	}

	public String toString() {

		return "Name of the Product: " + name + 
			   "\nQuantity in Stok: " + quantity + 
			   "\nTotal Value in Stok: " + String.format("%.2f", totalValueInStok());

}
}
