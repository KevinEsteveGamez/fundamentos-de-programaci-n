/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_14_EvaluarNumericoMejorado.java
 * Referencia: Capitulo 3 - Actividad 3.9.6 (Pagina 104)
 * Descripcion: Implementacion de la actividad de Clean Code: una funcion de validacion numerica
 * mas robusta y flexible que recibe parametros descriptivos ("entero" o "decimal") y es capaz
 * de clasificar automaticamente si una cadena es entera, decimal o invalida.
 */
public class Capitulo3_14_EvaluarNumericoMejorado {

    public static boolean EsNumeroEntero(String valorAValidar) {
        if (valorAValidar == null || valorAValidar.isEmpty()) return false;
        for (char c : valorAValidar.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static boolean EsNumeroDouble(String valorAValidar) {
        if (valorAValidar == null || valorAValidar.isEmpty()) return false;
        boolean puntoEncontrado = false;
        for (char c : valorAValidar.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !puntoEncontrado) {
                    puntoEncontrado = true;
                } else {
                    return false;
                }
            }
        }
        return puntoEncontrado; // O true si se acepta tambien como decimal un numero
    }

    /**
     * Actividad 3.9.6: Evalua un valor numerico recibiendo una cadena ("entero" o "decimal").
     * @param valorAValidar Cadena de texto a evaluar
     * @param tipoEsperado "entero" o "decimal"
     * @return true si cumple con el tipo indicado
     */
    public static boolean EvaluarNumerico(String valorAValidar, String tipoEsperado) {
        if (valorAValidar == null || tipoEsperado == null) return false;
        if (tipoEsperado.equalsIgnoreCase("entero")) {
            return EsNumeroEntero(valorAValidar);
        } else if (tipoEsperado.equalsIgnoreCase("decimal")) {
            return EsNumeroDouble(valorAValidar) || EsNumeroEntero(valorAValidar);
        }
        return false;
    }

    /**
     * Actividad 3.9.6 (Variante): Determina si la cadena es un entero, decimal o invalido
     * sin necesidad de recibir un segundo parametro.
     * @param valorAValidar Cadena a evaluar
     * @return "entero", "decimal" o "invalido"
     */
    public static String ClasificarTipoNumerico(String valorAValidar) {
        if (valorAValidar == null || valorAValidar.trim().isEmpty()) {
            return "invalido";
        }
        if (EsNumeroEntero(valorAValidar)) {
            return "entero";
        } else if (EsNumeroDouble(valorAValidar)) {
            return "decimal";
        }
        return "invalido";
    }

    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("  CAPITULO 3 - ACTIVIDAD 3.9.6: VALIDACION NUMERICA MEJORADA");
        System.out.println("==================================================================\n");

        System.out.println("--- 1. Pruebas con tipoEsperado ('entero' / 'decimal') ---");
        System.out.println("EvaluarNumerico('45', 'entero')     -> " + EvaluarNumerico("45", "entero"));
        System.out.println("EvaluarNumerico('45.90', 'entero')  -> " + EvaluarNumerico("45.90", "entero"));
        System.out.println("EvaluarNumerico('45.90', 'decimal') -> " + EvaluarNumerico("45.90", "decimal"));
        System.out.println("EvaluarNumerico('abc', 'decimal')   -> " + EvaluarNumerico("abc", "decimal"));

        System.out.println("\n--- 2. Pruebas con clasificacion automatica ---");
        String[] datos = {"100", "45.75", "0.5", "12a", "35.50.10", "hola"};
        for (String dato : datos) {
            System.out.printf("Valor: '%-10s' -> Clasificacion: %s\n", dato, ClasificarTipoNumerico(dato));
        }
    }
}
