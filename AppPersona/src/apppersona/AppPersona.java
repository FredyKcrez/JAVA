package apppersona;

public class AppPersona
{
    public static void main(String[] args)
    {
        Persona objeto = new Persona();
        objeto.setNombre("Monica");
        objeto.setEdad(19);
        objeto.setTrabaja(true);
        System.out.println(objeto);
        
        Persona objeto1 = new Persona("Alberto", 25, true);
        System.out.println(objeto1);
        
        
        if(objeto.getEdad()>objeto1.getEdad())
        {
            System.out.println("La persona de mayor edad es: ");
            System.out.println(objeto.getNombre());
        }
        else
            if(objeto.getEdad()<objeto1.getEdad())
            {
                System.out.println("La persona de mayor edad es: ");
                System.out.println(objeto1.getNombre());
            }
            else
                System.out.println("Ambas personas tienen la misma edad");
    }
}
