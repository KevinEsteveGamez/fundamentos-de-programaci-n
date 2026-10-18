/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_23 - Verificar Coincidencia de Regiones entre Dos Cadenas
 * Descripcion: Comparar si una subregión de una cadena coincide con una subregión de otra utilizando regionMatches().
 */
public class Tarea011_23 {
    public static void main(String[] args) {
        String cadena1 = "Río de Janeiro, Brasil";
        String cadena2 = "Paseo por el Río de Janeiro";

        // Comparar 'Río de Janeiro' (14 caracteres)
        boolean coincide = cadena1.regionMatches(0, cadena2, 13, 14);
        System.out.println("¿Coinciden las regiones especificadas-: " + coincide);
    }
}
