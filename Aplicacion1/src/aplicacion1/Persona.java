package aplicacion1;

public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private boolean trabaja;
    
    //Constructores
    //Constructor vacio
    public Persona()
    {
        nombre = "Desconocido";
        edad = 0;
        trabaja = false;
        
    }
    //Constructor parametrizado
    public Persona(String nombre, int edad, boolean trabaja)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.trabaja = trabaja;
    }
    
    //Metodos Sets
    public void setTrabaja()
    {
        this.trabaja = trabaja;
    }
    public void setNombre()
    {
        this.nombre = nombre;
    }
    public void setEdad()
    {
        this.edad = edad;
    }
    
    //Metodos Gets
    public boolean getTrabaja()
    {
        return trabaja;
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getEdad()
    {
        return edad;
    }
    
    //Metodo toString
    public String toString()
    {
        String estado = "<<Estado del objeto>>\n";
        estado+="Nombre: "+nombre+"\n";
        estado+="Edad: "+edad+"\n";
        estado +="Trabaja: "+trabaja+"\n";
        return estado;
    }
}
