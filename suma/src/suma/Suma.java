/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.util.Scanner;
/**
 *
 * @author PRN-315
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");
        System.out.println("Ingrese 2 numeros enteros separados por un espacio para sumarlos: ");
        int n1, n2;
        
        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        
        System.out.print("La suma de los 2 numeros es: ");
        System.out.println(n1 + n2);
    }
}