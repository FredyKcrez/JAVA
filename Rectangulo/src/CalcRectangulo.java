
import javax.swing.JOptionPane;

public class CalcRectangulo
{
    public static void main(String[] args)
    {
        Rectangulo rectan = new Rectangulo();
        int cont = 0;
        double Long, Anch;
        
        while(cont==0)
        {
            Long = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del Rectangulo"));
            cont = rectan.setLongitud(Long);
        }
        cont = 0;
        while(cont==0)
        {
            Anch = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la anchura del Rectangulo"));
            cont = rectan.setAnchura(Anch);
        }
        
        rectan.imprimirRectan(rectan);
    }
}
