import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.printf("Enter first price:");
		int preu1 = entrada.nextInt();
		
		System.out.printf("Enter second price:");
		int preu2= entrada.nextInt();

		System.out.printf("Enter third price:");
		int preu3= entrada.nextInt();
		
		System.out.printf("Enter fourth price:");
		int preu4= entrada.nextInt();
		
		System.out.printf("Enter fifth price:");
		int preu5= entrada.nextInt();
		
		int total = preu1+preu2+preu3+preu4+preu5;
		System.out.printf("Total price: %d %n", total);

		double average = (double)10/3; //3.33
		//double average = 10/3.0;

		System.out.printf("Total average : %f %n", average);

	}
}
