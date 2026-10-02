public class PrintFormat {

	public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double height = 1.82678;
        double grade = 8.756;
        String subject = "Mathematics";

        System.out.printf("Name: %s %n" , name); 
		//nombre + "texto" + "salto de linea"
        System.out.printf("Age: %d years old %n", age); 
		//edad + "numeros enteros" + texto + "salto de linea"
        System.out.printf("Height: %.2f meters %n", height); 
		//largo + "numero de decimales" + texto + "salto de linea"
        System.out.printf("Grade in %S: %.1f %n", subject, grade); 
		// nota + "texto en mayuscula" + "numero de decimales" + "salto de linea"
    }
}