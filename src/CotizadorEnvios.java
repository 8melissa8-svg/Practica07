/**
 * Clase de utileria que contiene las reglas de negocio para la cotizacion de envios
 * y evaluacion de politicas de seguro.
 * 
 * NOTA: Todos los metodos son estaticos (static), por lo que esta clase NO se instancia.
 * 
 * @author Melissa Prado Hernandez 
 * @version 1.0
 */
public class CotizadorEnvios {

    /**
     * Constructor privado para evitar que la clase sea instanciada con new.
     */
    public CotizadorEnvios() {}

    /**
     * Revisa que los datos del paquete no sean menores o iguales a cero
     * y que el paquete no sea nulo.
     * 
     * @param p El objeto Paquete a validar.
     * @return true si el paquete cumple todas las reglas; false en caso contrario.
     */
    public static boolean esPaqueteValido(Paquete p) {
        if (p == null) {
            return false;
        }
        if (p.getPesoKilogramos() <= 0) {
            return false;
        }
        if (p.getAltoDelPaquete() <= 0) {
            return false;
        }
        if (p.getAnchoDelPaquete() <= 0) {
            return false;
        }
        if (p.getLargoDelPaquete() <= 0) {
            return false;
        }
        if (p.getValorMonetario() < 0) {
            return false;
        }
        return true;
    }

    /**
     * Cotiza el costo del envio aplicando la tarifa escalonada segun el peso cobrable.
     * 
     * @param p El objeto Paquete a cotizar.
     * @return El costo total en MXN, o -1.0 si el paquete no es valido.
     */
    public static double cotizarEnvios(Paquete p) {
        if (esPaqueteValido(p) == false) {
            return -1.0;
        }

        double peso = p.obtenerPesoCobrable();

        if (peso <= 5.0) {
            return 120.00;
        } else if (peso <= 15.0) {
            return 120.00 + (18.00 * (peso - 5.0));
        } else {
            return 300.00 + (25.00 * (peso - 15.0));
        }
    }

    /**
     * Revisa si el paquete requiere seguro obligatorio por su valor monetario
     * o por sobrepasar limites de dimensiones.
     * 
     * @param p El objeto Paquete a evaluar.
     * @return true si requiere seguro; false en caso contrario.
     */
    public static boolean requiereSeguro(Paquete p) {
        if (esPaqueteValido(p) == false) {
            return false;
        }

        // Si vale mas de 3000
        if (p.getValorMonetario() > 3000.00) {
            return true;
        }

        // Si algun lado mide mas de 60 cm
        if (p.getAltoDelPaquete() > 60.0 || p.getAnchoDelPaquete() > 60.0 || p.getLargoDelPaquete() > 60.0) {
            return true;
        }

        // Si la suma de lados supera 150 cm
        double sumaLados = p.getAltoDelPaquete() + p.getAnchoDelPaquete() + p.getLargoDelPaquete();
        if (sumaLados > 150.0) {
            return true;
        }

        return false;
    }
}