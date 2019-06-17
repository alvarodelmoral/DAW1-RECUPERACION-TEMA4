package zoo;

/**
 *
 * @author usuario
 */
public abstract class Pez extends Animal {

    /**
     *
     */
    public enum Tipo {

        /**
         *
         */
        OSEO,

        /**
         *
         */
        CARTILAGINOSO
    }

    private int velocidadMaxNatacion;
    private Tipo tipo;
    private static int numPeces = 0;

    /**
     *
     * @param velocidadMaxNatacion
     * @param tipo
     */
    public Pez(int velocidadMaxNatacion, Tipo tipo) {
        this.velocidadMaxNatacion = velocidadMaxNatacion;
        this.tipo = tipo;
        this.numPeces++;
    }

    /**
     *
     * @param velocidadMaxNatacion
     * @param tipo
     * @param habitat
     * @param comida
     * @param longevidad
     */
    public Pez(int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(habitat, comida, longevidad);
        this.velocidadMaxNatacion = velocidadMaxNatacion;
        this.tipo = tipo;
        this.numPeces++;
    }

    /**
     *
     * @return
     */
    public int getVelocidadMaxNatacion() {
        return velocidadMaxNatacion;
    }

    /**
     *
     * @param velocidadMaxNatacion
     */
    public void setVelocidadMaxNatacion(int velocidadMaxNatacion) {
        this.velocidadMaxNatacion = velocidadMaxNatacion;
    }

    /**
     *
     * @return
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public static int getNumPeces() {
        return numPeces;
    }

    /**
     *
     * @param numPeces
     */
    public static void setNumPeces(int numPeces) {
        Pez.numPeces = numPeces;
    }

    /**
     *
     * @return
     */
    public String getComida() {
        return comida;
    }

    /**
     *
     * @param comida
     */
    public void setComida(String comida) {
        this.comida = comida;
    }

    /**
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        numPeces--;
        super.finalize();
    }
}
