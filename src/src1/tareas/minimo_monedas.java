package src1.tareas;

//import javax.swing.JOptionPane;
import java.util.*;

public class minimo_monedas {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        double importe=0;
        do{
            try{
                System.out.print("Ingresa el cambio a devolver:");
                importe=sc.nextDouble();
            }catch(Exception e){
                System.out.println("Introduciste un dato erroneo.");
                System.out.println("");
                sc.nextLine();
            }
        }
        while(importe<=0);
 
        calcular(importe);
    }
 
    public static void calcular(double importe)
    {
        double [] monedas={0.25, 0.10, 0.05, 0.01};
        double [] devolver={0,0,0,0};
 
        for(int i=0;i<monedas.length;i++)
        {
            if(importe>=monedas[i])
            {
                devolver[i]=Math.floor(importe/monedas[i]);
                importe=importe-(devolver[i]*monedas[i]);
            }
        }
         for(int i=0;i<monedas.length;i++)
        {
            if(devolver[i]>0)
            {
                System.out.println("Dar "+devolver[i]+" monedas de: "+monedas[i]+" Euros");
            }
        }
    }
 
}
