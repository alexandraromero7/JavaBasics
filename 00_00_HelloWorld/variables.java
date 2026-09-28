/* Hacer un programa que dado un numero de alumnos los divida entree el numero de clase, el reslutado sera los alumnos de cada clase */

public class variables {
	public static void main(String[] args) {
	
	System.out.println("funciona");
	//variable 27 alumnos
	//TipoDeDato nomVariable = _valor__;
	int numAlum = 27;
	System.out.println("numero inicial alumnes:" + numAlum);
	int numClasses = 2;
	
	double numTotalClasse = (1.0*numAlum) / numClasses;
	numTotalClasse = numAlum / numClasses;
	numTotalClasse = (double)numAlum / numClasses;
	System.out.println("numero total de clase:" + numTotalClasse);

	int numAlumnesCla = (int)numTotalClasse;
	System.out.println("numero total classe tipus INT:" + numAlumnesCla);
	
	double comprovarResultat = numTotalClasse + numTotalClasse;
	System.out.println( 0.1+0.1+0.1 );
	
	System.out.println("alumnes q sobren:" + numAlum % numClasses );

	
	}
}