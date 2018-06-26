/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Fredy Kcrez
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha nacimiento = new Fecha(7, 24, 1970);
        Fecha contratacion = new Fecha(5, 31, 2016);
        Empleado empleado = new Empleado();

        if(!nacimiento.equals(contratacion)) {
            empleado.setPrimerNombre("Juan");
            empleado.setApellidoPaterno("Perez");
            empleado.setFechaNacimiento(nacimiento);
            empleado.setFechaContratacion(contratacion);
        }

        System.out.println(empleado);                 //Invoca el método “toString”
        contratacion.siguienteMes();
        System.out.println(empleado);                 //Invoca el método “toString”
    }
    
}
