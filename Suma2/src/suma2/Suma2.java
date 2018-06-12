/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma2;
import java.util.Scanner;
/**
 *
 * @author PRN-315
 */
public class Suma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");
        int n1, n2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        n2 = entrada.nextInt();
        
        System.out.print("La suma de los dos números es: ");
        System.out.println(n1 + n2);
    }
}
