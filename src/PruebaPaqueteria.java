/**
 * Clase prueba de las anteriores clases 
 * @author Melissa Prado Hernandez
 * @version 1.0
 */
public class PruebaPaqueteria {

    /**
     * Metodo principal que ejecuta las pruebas del programa.
     * 
     * @param args Argumentos de linea de comandos.
     */
    public static void main(String[] args) {

        System.out.println("Prueba de envios ");

        /* Aqui creé los diferentes paquetes de prueba para verificar que el programa funciona, y creé 
           uno en especifico que no cumplia los criterios */
        Paquete p1 = new Paquete("Paquete 1", 3.0, 20.0, 15.0, 10.0, 500.0);
        Paquete p2 = new Paquete("Paquete 2", 12.0, 40.0, 30.0, 25.0, 2500.0);
        Paquete p3 = new Paquete("Paquete 3", 18.0, 70.0, 50.0, 40.0, 4000.0);
        Paquete p4 = new Paquete("Paquete 4", -2.0, 0.0, 10.0, 10.0, -100.0); 

        // Probamos el Paquete 1 
        System.out.println("Probando Paquete 1 ");
        if (CotizadorEnvios.esPaqueteValido(p1)) {
            System.out.println("Codigo: " + p1.getAlfanumerico());
            System.out.println("Costo total: pesos:"  + CotizadorEnvios.cotizarEnvios(p1));
            System.out.println("Requiere seguro: " + CotizadorEnvios.requiereSeguro(p1));
        } else {
            System.out.println("El Paquete 1 no es valido.");
        }

        //  Probamos el Paquete 2 
        System.out.println("Probando Paquete 2 ");
        if (CotizadorEnvios.esPaqueteValido(p2)) {
            System.out.println("Codigo: " + p2.getAlfanumerico());
            System.out.println("Costo total: pesos:"  + CotizadorEnvios.cotizarEnvios(p2));
            System.out.println("Requiere seguro: " + CotizadorEnvios.requiereSeguro(p2));
        } else {
            System.out.println("El Paquete 2 no es valido.");
        }

        // Probamos el Paquete 3 
        System.out.println(" Probando Paquete 3");
        if (CotizadorEnvios.esPaqueteValido(p3)) {
            System.out.println("Codigo: " + p3.getAlfanumerico());
            System.out.println("Costo total: pesos:"  + CotizadorEnvios.cotizarEnvios(p3));
            System.out.println("Requiere seguro: " + CotizadorEnvios.requiereSeguro(p3));
        } else {
            System.out.println("El Paquete 3 no es valido.");
        }

        // Probamos el Paquete 4 (Inválido) 
        System.out.println("Probando Paquete 4");
        if (CotizadorEnvios.esPaqueteValido(p4)) {
            System.out.println("Codigo: " + p4.getAlfanumerico());
            System.out.println("Costo total: pesos:"  + CotizadorEnvios.cotizarEnvios(p4));
            System.out.println("Requiere seguro: " + CotizadorEnvios.requiereSeguro(p4));
        } else {
            System.out.println("El Paquete 4 no es valido.");
        }

        /* En esta parte voy a poner a prueba mi método de si me pide seguro por medir 
           más de 60 cm */
        System.out.println("Mi paquete prueba");

        Paquete miPaquete1 = new Paquete("Mi paquete", 2.0, 65.0, 10.0, 10.0, 500.0);
        
        // Creamos un paquete que vale null para probar que no se rompa el programa
        Paquete miPaqueteNulo = null;

        // Probamos miPaquete1
        if (CotizadorEnvios.esPaqueteValido(miPaquete1)) {
            System.out.println("Mi Paquete 1 es valido.");
            System.out.println("¿Requiere seguro?: " + CotizadorEnvios.requiereSeguro(miPaquete1));
        }

        // Probamos miPaqueteNulo
        if (CotizadorEnvios.esPaqueteValido(miPaqueteNulo)) {
            System.out.println("El paquete nulo es valido.");
        } else {
            System.out.println("El paquete nulo NO es valido (funciono la proteccion).");
        }
    }
}