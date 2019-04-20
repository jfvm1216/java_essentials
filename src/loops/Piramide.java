package loops;

public class Piramide {
	
	public static void main (String [] args) {
		/* El objetivo es crear una piramide de base 4
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		int num=0;
				
				while (num <= 4) {
					int num_asteriscos=num;
					//int control=1;
					while (num <= 4) {
						System.out.print("*");
					}
					num ++;
					System.out.println();
				}
	}
}
