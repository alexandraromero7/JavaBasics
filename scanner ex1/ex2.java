import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.printf("Enter first temp:");
		float temp1 = entrada.nextFloat();
		
		System.out.printf("Enter second temp:");
		float temp2= entrada.nextFloat();

		System.out.printf("Enter third temp:");
		float temp3= entrada.nextFloat();
		
		System.out.printf("Enter fourth temp:");
		float temp4= entrada.nextFloat();
		
		System.out.printf("Enter fifth temp:");
		float temp5= entrada.nextFloat();
		

        double max = temp1;
        max = Math.max(max, temp2);
        max = Math.max(max, temp3);
        max = Math.max(max, temp4);
        max = Math.max(max, temp5);
        
        double min = temp1;
        min = Math.min(min, temp2);
        min = Math.min(min, temp3);
        min = Math.min(min, temp4);
        min = Math.min(min, temp5);

        System.out.printf("Max : %1.1f %n", max);
        System.out.printf("Min : %1.1f %n", min);
    }
}
