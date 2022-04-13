
import java.util.Scanner;


public class PruebaCaja {
    public static void main(String[] args) {
 
        System.out.println("Bienvenidos crack digite las dimensiones de la caja");
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el ancho de la caja");
        int ancho=teclado.nextInt();
        System.out.println("Ingrese el alto de la caja");
        int alto=teclado.nextInt();
        System.out.println("Ingrese la profundidad de la caja");
        int profundidad=teclado.nextInt();
        
        Caja Volumen=new Caja(ancho,alto,profundidad);
        System.out.println("VolumenCaja: "+Volumen.VolumenCaja());
        
        System.out.println("Felicitaciones crack lo lograste");
        
    }
}
