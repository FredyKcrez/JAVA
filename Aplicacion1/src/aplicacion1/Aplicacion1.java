package aplicacion1;
import java.util.*;
import java.lang.String;
import javax.swing.JOptionPane;


public class Aplicacion1
{
    public static void main(String[] args)
    {
        String name;
        int anho;
        boolean situacion;
        
        name = JOptionPane.showInputDialog("Digite el nombre:");
        anho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad:"));
        situacion=Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Trabaja(true or false):"));
        
        //crear objeto vacio
        Persona objeto1 = new Persona(name, anho, situacion);
        
        //Estado del objeto
        JOptionPane.showMessageDialog(null,objeto1);
    }
}