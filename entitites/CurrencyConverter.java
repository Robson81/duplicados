package entitites;

public class CurrencyConverter {
	
	
	
	public static final double IOF = 0.06;
	
	public static double converted;
	
	public static double currencyConverter(double dolarPrice, double dolarQuantity) {
		
		
		return  converted = dolarPrice*dolarQuantity + dolarPrice*dolarQuantity*IOF;
		
	}


	public String toString() {
		
		return  "Amount to be paid in reais: " + String.format("R$ %.2f", converted);
	}
	
}
