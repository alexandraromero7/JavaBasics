public class TripleJumpRecord {

	public static void main(String[] args) {
		// Current record
		double record = 18.29;
		
		// Player records
		double jump1 = 15.58;
		double jump2 = 18.35;
		double jump3 = 17.26;
		double jump4 = 18.31;
				
		// Get new record 
		
		double max = Math.max(jump1,jump2); //mas grande q
		double gran = Math.max(jump3,jump4); //mas grande q
		double may = Math.max(max,gran);
		double menor = Math.floor(may); /* entero menor */
		double mayor = Math.ceil(may); /*entero mayor*/
		
		
		System.out.println("The current record is now " + may + " meters");
		System.out.println("The current record is below " + (int)mayor + " meters");
		System.out.println("The current record is above " + (int)menor + " meters");
		

	}

}