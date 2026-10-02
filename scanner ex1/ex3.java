import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.printf("Enter streets number:");
		int number = entrada.nextInt();
		
		entrada.nextLine(); 
		
		System.out.printf("Enter street name:");
		String name = entrada.nextLine();

		System.out.printf("Enter city:");
		String city = entrada.nextLine();
		
		System.out.printf("Enter country:");
		String country = entrada.nextLine();
		
		System.out.printf("Enter postal code:");
		String code= entrada.nextLine();
		
		System.out.println("You address is:");
		System.out.println(number + " " + name);
		System.out.println(city);
		System.out.println(code);
		System.out.println(country);


	}
}
