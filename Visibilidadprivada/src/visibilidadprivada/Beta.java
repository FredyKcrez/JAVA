package visibilidadprivada;

public class Beta {
    public static void main(String[ ] args){
        probarAlpha();
    }
    
    static void probarAlpha() {
    Alpha a = new Alpha();
    a.estoyProtegido = 10; // legal
    a.metodoProtegido(); /
}
