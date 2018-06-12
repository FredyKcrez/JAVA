
import javax.swing.JOptionPane;

public class Rectangulo
{
    private double longitud;
    private double anchura;
    
    Rectangulo()
    {
        longitud = 1;
        anchura = 1;
    }

    public double getLongitud() {
        return longitud;
    }

    public int setLongitud(double longitud)
    {
        if(longitud>0.0 & longitud<20.0)
        {
            this.longitud = longitud;
            return 1;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Longitud no esta en el intervalo de 0.0 a 20.0");
            return 0;
        }
    }

    public double getAnchura() {
        return anchura;
    }

    public int setAnchura(double anchura)
    {
        if(anchura>0.0 & anchura<20.0)
        {
            this.anchura = anchura;
            return 1;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Anchura no esta en el intervalo de 0.0 a 20.0");
            return 0;
        }
    }
    
    public double calcPerimetro(Rectangulo x)
    {
        return (x.anchura * x.anchura)/2;
    }
    
    public double calcArea(Rectangulo y)
    {
        return (y.anchura * y.longitud);
    }
    
    public void imprimirRectan(Rectangulo z)
    {
        JOptionPane.showMessageDialog(null, "El area de su rectangulo es de: " + z.calcArea(z)+ "\nEl perimetro de su rectangulo es de: " + z.calcArea(z));
    }
}
