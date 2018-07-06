package bues;

/**
 * @date 05/07/2018
 * @author Fredy Kcrez
 */
public abstract class Boleto {
    private int numeroSerie;
    protected double precio;
    
    public Boleto(double precio) {
        this.setPrecio( precio );
    }

    /**
     * @return the numeroSerie
     */
    public int getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * @param numeroSerie the numeroSerie to set
     */
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}