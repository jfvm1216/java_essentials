package conditionals;

import libs.Input;

public class Adulto {

	public static void main (String [] args) {
		int edad;
		System.out.println("Ingresa la edad");
		edad=Input.get_int();
		if(edad>=18) {
			System.out.println("Adulto")
		}
	}
	
	
}
