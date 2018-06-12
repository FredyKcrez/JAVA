/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impuesto;
import javax.swing.JOptionPane;
/**
 *
 * @author PRN-315
 */
public class Impuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double IVA = 0.13;
        final double IMPUESTO_ESPECIAL = 0.12;
        String A;
        
        
        A=JOptionPane.showInputDialog("Digite su Nombre: ");
        
        //double valorGravado = venta + (venta * IVA) + (venta *
        //IMPUESTO_ESPECIAL);
        
        JOptionPane.showMessageDialog(null,"Su nombre es: " +A);
    }
}
