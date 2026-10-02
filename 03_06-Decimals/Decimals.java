public class Decimals {
	public static void main(String[] args) {
	
	double number = 12.3456789;
	
	double a = Math.round(number * 1) / 1;
	double b = Math.round(number * 100) / 100.0;
	double c = Math.round(number * 10000) / 10000.0;
	double d = Math.round(number * 1000000) / 1000000.0;
	
	System.out.println("Rounded to 0 decimals: " + (int)a);
	System.out.println("Rounded to 2 decimals: " + b);
	System.out.println("Rounded to 4 decimals: " + c);
	System.out.println("Rounded to 6 decimals: " + d);
	
	}
}