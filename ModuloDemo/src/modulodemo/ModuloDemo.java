/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulodemo;

/**
 *
 * @author ROBERTO CACERES
 */
public class ModuloDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iresult, irem;
        double dresult, drem;
        
        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        System.out.println("Resultado y residuo de 10/3: " +iresult + " " + irem);
        System.out.println("Resultado y residuo de 10.0/3.0: " +dresult + " " + drem);
    }
}
