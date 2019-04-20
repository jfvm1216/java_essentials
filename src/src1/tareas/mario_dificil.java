package src1.tareas;
import javax.swing.JOptionPane;

public class mario_dificil {
	public static void main (String [] args) {
		int num;
		String cadena="";
		num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de filas"));
		for(int i=1; i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(j<num-(i-1)) {
				System.out.print(" ");
				}else {
				System.out.print("#");
				}
			}
			System.out.print("   ");
			cadena+="#";
			System.out.print(cadena);
			System.out.print("\n");
		}
	}
}