/**
 * Clase principal que contiene atributos, setters, getter
   Costructores y metodos 
 * 
 * @author Melissa Prado Hernandez
 * @version 1.0
 */
public class Paquete {

    // Atributos privados de la clase
    private double pesoKilogramos;
    private double altoDelPaquete; 
    private String alfanumerico;
    private double anchoDelPaquete;
    private double largoDelPaquete;
    private double valorMonetario;

    /**
     * Constructor por defecto sin parametros.
     */
    public Paquete() {
        this.pesoKilogramos = 1.0;
        this.altoDelPaquete = 10.0;
        this.alfanumerico = "N/A";
        this.anchoDelPaquete = 10.0;
        this.largoDelPaquete = 10.0;
        this.valorMonetario = 0.0;
    }

    /**
     * Constructor con un parametro (alfanumerico).
     * 
     * @param alfanumerico Codigo identificador del paquete.
     */
    public Paquete(String alfanumerico) {
        this.alfanumerico = alfanumerico;
        this.pesoKilogramos = 1.0;
        this.altoDelPaquete = 10.0;
        this.anchoDelPaquete = 10.0;
        this.largoDelPaquete = 10.0;
        this.valorMonetario = 0.0;
    }

    /**
     * Constructor con dos parametros.
     * 
     * @param alfanumerico Codigo del paquete.
     * @param pesoKilogramos Peso fisico en kilogramos.
     */
    public Paquete(String alfanumerico, double pesoKilogramos) {
        this.alfanumerico = alfanumerico;
        this.pesoKilogramos = pesoKilogramos;
        this.altoDelPaquete = 10.0;
        this.largoDelPaquete = 10.0;
        this.anchoDelPaquete = 10.0;
        this.valorMonetario = 0.0;
    }

    /**
     * Constructor con tres parametros.
     * 
     * @param alfanumerico Codigo del paquete.
     * @param pesoKilogramos Peso fisico en kg.
     * @param altoDelPaquete Alto en cm.
     */
    public Paquete(String alfanumerico, double pesoKilogramos, double altoDelPaquete) {
        this.alfanumerico = alfanumerico;
        this.pesoKilogramos = pesoKilogramos;
        this.altoDelPaquete = altoDelPaquete;
        this.largoDelPaquete = 10.0;
        this.anchoDelPaquete = 10.0;
        this.valorMonetario = 0.0;
    }

    /**
     * Constructor con cuatro parametros.
     * 
     * @param alfanumerico Codigo del paquete.
     * @param pesoKilogramos Peso fisico en kg.
     * @param altoDelPaquete Alto en cm.
     * @param largoDelPaquete Largo en cm.
     */
    public Paquete(String alfanumerico, double pesoKilogramos, double altoDelPaquete, double largoDelPaquete) {
        this.alfanumerico = alfanumerico;
        this.pesoKilogramos = pesoKilogramos;
        this.altoDelPaquete = altoDelPaquete;
        this.largoDelPaquete = largoDelPaquete;
        this.anchoDelPaquete = 10.0;
        this.valorMonetario = 0.0;
    }

    /**
     * Constructor con cinco parametros.
     * 
     * @param alfanumerico Codigo del paquete.
     * @param pesoKilogramos Peso fisico en kg.
     * @param altoDelPaquete Alto en cm.
     * @param largoDelPaquete Largo en cm.
     * @param anchoDelPaquete Ancho en cm.
     */
    public Paquete(String alfanumerico, double pesoKilogramos, double altoDelPaquete, double largoDelPaquete, double anchoDelPaquete) {
        this.alfanumerico = alfanumerico;
        this.pesoKilogramos = pesoKilogramos;
        this.altoDelPaquete = altoDelPaquete;
        this.largoDelPaquete = largoDelPaquete;
        this.anchoDelPaquete = anchoDelPaquete;
        this.valorMonetario = 0.0;
    }

    /**
     * Constructor completo con seis parametros.
     * 
     * @param alfanumerico Codigo del paquete.
     * @param pesoKilogramos Peso fisico en kg.
     * @param altoDelPaquete Alto en cm.
     * @param largoDelPaquete Largo en cm.
     * @param anchoDelPaquete Ancho en cm.
     * @param valorMonetario Valor monetario declarado en pesos
     */
    public Paquete(String alfanumerico, double pesoKilogramos, double altoDelPaquete, double largoDelPaquete, double anchoDelPaquete, double valorMonetario) {
        this.alfanumerico = alfanumerico;
        this.pesoKilogramos = pesoKilogramos;
        this.altoDelPaquete = altoDelPaquete;
        this.largoDelPaquete = largoDelPaquete;
        this.anchoDelPaquete = anchoDelPaquete;
        this.valorMonetario = valorMonetario;
    }

    //  Los Getters 

    /**
     * Obtiene el codigo alfanumerico.
     * @return El codigo del paquete.
     */
    public String getAlfanumerico() {
        return this.alfanumerico;
    }

    /**
     * Obtiene el peso fisico en kg.
     * @return El peso en kg.
     */
    public double getPesoKilogramos() {
        return this.pesoKilogramos;
    }

    /**
     * Obtiene el alto del paquete.
     * @return El alto en cm.
     */
    public double getAltoDelPaquete() {
        return this.altoDelPaquete;
    }

    /**
     * Obtiene el ancho del paquete.
     * @return El ancho en cm.
     */
    public double getAnchoDelPaquete() {
        return this.anchoDelPaquete;
    }

    /**
     * Obtiene el largo del paquete.
     * @return El largo en cm.
     */
    public double getLargoDelPaquete() {
        return this.largoDelPaquete;
    }

    /**
     * Obtiene el valor monetario.
     * @return El valor em pesos
     */
    public double getValorMonetario() {
        return this.valorMonetario;
    }

    //  Los Setters

    /**
     * Establece el codigo alfanumerico.
     * @param alfanumerico 
     */
    public void setAlfanumerico(String alfanumerico) {
        this.alfanumerico = alfanumerico;
    }

    /**
     * Establece el peso fisico asegurando que sea mayor a 0.
     * @param pesoKilogramos 
     */
    public void setPesoKilogramos(double pesoKilogramos) {
        if (pesoKilogramos > 0) {
            this.pesoKilogramos = pesoKilogramos;
        } else {
            System.out.println("No se aceptan ese tipo de valores ");
        }
    }

    /**
     * Establece el alto asegurando que sea mayor a 0.
     * @param altoDelPaquete 
     */
    public void setAltoDelPaquete(double altoDelPaquete) {
        if (altoDelPaquete > 0) {
            this.altoDelPaquete = altoDelPaquete;
        } else {
            System.out.println("No se aceptan ese tipo de valores");
        }
    }

    /**
     * Establece el ancho asegurando que sea mayor a 0.
     * @param anchoDelPaquete 
     */
    public void setAnchoDelPaquete(double anchoDelPaquete) {
        if (anchoDelPaquete > 0) {
            this.anchoDelPaquete = anchoDelPaquete;
        } else {
            System.out.println("No se aceptan ese tipo de valores");
        }
    }

    /**
     * Establece el largo asegurando que sea mayor a 0.
     * @param largoDelPaquete 
     */
    public void setLargoDelPaquete(double largoDelPaquete) {
        if (largoDelPaquete > 0) {
            this.largoDelPaquete = largoDelPaquete;
        } else {
            System.out.println("No se aceptan ese tipo de valores");
        }
    }

    /**
     * Establece el valor monetario asegurando que no sea negativo.
     * @param valorMonetario 
     */
    public void setValorMonetario(double valorMonetario) {
        if (valorMonetario >= 0) {
            this.valorMonetario = valorMonetario;
        } else {
            System.out.println("No se aceptan ese tipo de valore");
        }
    }

    //  Métodos con calculos

    /**
     * Calcula el peso volumetrico aplicando la formula (largo * ancho * alto) / 5000.
     * @return El peso volumetrico 
     */
    public double calculaPesoVolumetrico() {
        return (this.largoDelPaquete * this.anchoDelPaquete * this.altoDelPaquete) / 5000.0;
    }

    /**
     * Determina el peso cobrable comparando el peso fisico contra el volumetrico.
     * @return El valor mayor entre peso fisico y volumetrico.
     */
    public double obtenerPesoCobrable() {
        double pesoVolumetrico = calculaPesoVolumetrico();
        if (this.pesoKilogramos > pesoVolumetrico) {
            return this.pesoKilogramos;
        } else {
            return pesoVolumetrico;
        }
    }
}













