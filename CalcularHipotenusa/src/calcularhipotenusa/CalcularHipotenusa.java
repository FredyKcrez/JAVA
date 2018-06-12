/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularhipotenusa;

/**
 *
 * @author ROBERTO CACERES
 */
public class CalcularHipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x,y,z;
        
        x=3;
        y=4;
        z=Math.sqrt(x*x + y*y);
        System.out.println("La Hipotenusa es: " + z);
    }
}
