package entitites;

public class Product {

	public String name;
	public double price;
	public int quantity;

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
