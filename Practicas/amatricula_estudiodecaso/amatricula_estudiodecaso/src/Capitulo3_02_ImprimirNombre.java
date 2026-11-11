/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_02_ImprimirNombre.java
 * Referencia: Capitulo 3 - Figura 30 (Pagina 57)
 * Descripcion: Ejemplo de un procedimiento (void) que realiza una tarea y no devuelve ningun valor.
 */
public class Capitulo3_02_ImprimirNombre {

    /**
     * Procedimiento que imprime en consola el valor del parametro que recibe.
     * @param parametro Cadena de texto a imprimir
     */
    public static void imprimirNombre(String parametro) {
        System.out.println(parametro);
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - FIGURA 30: PROCEDIMIENTO IMPRIMIR");
        System.out.println("=================================================");

        // Invocacion del procedimiento con diferentes cadenas
        imprimirNombre("Hola, este es un procedimiento en Java.");
        imprimirNombre("Muestra informacion en consola sin retornar valores.");
        imprimirNombre("Sistema de Punto de Venta - Tienda de Abarrotes.");
    }
}
