package apppersona;

public class Persona
{
    private String nombre;
    private int edad;
    private boolean trabaja;
    
    public Persona()
    {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.trabaja = false;
    }
    
    public Persona(String nombre, int edad, boolean trabaja)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.trabaja = trabaja;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public void setTrabaja(boolean trabaja)
    {
        this.trabaja = trabaja;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public boolean getTrabaja()
    {
        return trabaja;
    }
    
    public String toString()
    {
        String estado = "<<Estado de la Persona>>\n";
        estado += "Nombre: " +nombre+ "\n";
        estado += "Edad: " +edad+ "\n";
        estado += "Trabaja: " +trabaja+ "\n";
        return estado;
    }
}