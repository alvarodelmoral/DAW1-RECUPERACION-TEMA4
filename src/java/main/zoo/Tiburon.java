package zoo;

/**
 * Este es el codigo de la clase hija Tiburón que proviene de la clase padre pez
 * 
 * @author usuario
 *
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     * Método que asigna valores a los atributos 
     * 
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * Constructor
     * Método que indica los atributos especie, peligroso, velocidadMaxNatacion y el tipo
     * 
     * @param especie indica la especie
     * @param peligroso indica la peligrosidad que tiene dicho animal
     * @param velocidadMaxNatacion indica la velocidad máxima a la que nada dicho animal
     * @param tipo indica que tipo es
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * Método que llama a los atributos especie, peligroso, velocidadMaxNatacion 
     * y el super a tipo, habitat, comida y longevidad
     * 
     * @param especie indica la especie 
     * @param peligroso indica la peligrosidad que tiene dicho animal
     * @param velocidadMaxNatacion indica la velocidad máxima a la que nada dicho animal
     * @param tipo indica que tipo es
     * @param habitat indica el habitat que suele encontrarse
     * @param comida indica la comida que ingiere dicho animal
     * @param longevidad indica sus años de vida
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * Este método sirve para calcular la velocidad máxima de nado en km/h
     * 
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     *  Este método sirve para indicar lo que come el tiburón
     * 
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * Este método devuelve una llamada al código pez
     * 
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
