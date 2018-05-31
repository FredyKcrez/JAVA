package visibilidadprivada;


class Alpha {
    private int soyPrivado;
    private void metodoPrivado() {
        System.out.println("metodoPrivado");
    }
    
    public void metodoPublico() {
    System.out.println("metodoPublico");
    System.out.println("Atributo privado: "+ soyPrivado);
    System.out.println("metodoPrivado: ");
    metodoPrivado();
    }
}
