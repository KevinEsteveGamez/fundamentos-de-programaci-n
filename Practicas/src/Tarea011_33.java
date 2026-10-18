/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_33 - Generar Todos los Entrelazados Posibles de Dos Cadenas
 * Descripcion: Generar recursivamente todas las combinaciones que entrelacen dos cadenas preservando el orden relativo de sus caracteres.
 */
public class Tarea011_33 {
    public static void main(String[] args) {
        String cadena1 = "WX";
        String cadena2 = "YZ";
        System.out.println("Las cadenas originales son: " + cadena1 + " y " + cadena2);
        System.out.println("Los entrelazados posibles son:");
        generarEntrelazados("", cadena1, cadena2);
    }

    public static void generarEntrelazados(String prefijo, String cad1, String cad2) {
        if (cad1.isEmpty() && cad2.isEmpty()) {
            System.out.println(prefijo);
            return;
        }
        if (!cad1.isEmpty()) {
            generarEntrelazados(prefijo + cad1.charAt(0), cad1.substring(1), cad2);
        }
        if (!cad2.isEmpty()) {
            generarEntrelazados(prefijo + cad2.charAt(0), cad1, cad2.substring(1));
        }
    }
}
