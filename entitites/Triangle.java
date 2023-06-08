package entitites;

public class Triangle {

	public Double a, b, c;

	public Double areaTriangle() {

		double p = (a + b + c) / 2.0;

		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	
	}

}
