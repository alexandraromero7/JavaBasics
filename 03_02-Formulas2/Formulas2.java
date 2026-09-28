public class Formulas2 {
	public static void main(String[] args) {
		
	double a = 25.5;
	double b = 50.67;
	double c = 2.0;
	double d = 10.5;
	double e = -2.5;
	double f = 13.6;
	double g = 2.2;
	double h = Math.PI;
	double j = 2;
	double i = 3;
	
	double f1 = Math.sqrt (a);
	double f2 = Math.pow(b,4) - Math.pow(c,3);
	double f3 = j*d;
	
	double g1 = (i*(Math.pow(e,2)))-(Math.pow(f,3));
	double g2 = (h*Math.sqrt(g));
	
	double op1 = (f2*f1)/f3;
	
	double op2 = (g1/g2);
	
	System.out.println("Formula 1 = " + op1 );	
		
	System.out.println("Formula 2 = " + op2);	
	}
}