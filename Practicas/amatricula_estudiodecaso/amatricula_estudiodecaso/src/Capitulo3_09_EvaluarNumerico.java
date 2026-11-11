/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_09_EvaluarNumerico.java
 * Referencia: Capitulo 3 - Seccion 3.5.3 (Paginas 80-81)
 * Descripcion: Funcion que opera como selector de validacion numerica delegando a
 * EsNumeroEntero o EsNumeroDouble mediante una estructura switch segun el tipo especificado
 * (1 = Entero, 2 = Decimal).
 */
public class Capitulo3_09_EvaluarNumerico {

    public static boolean EsNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty()) {
            return false;
        }
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        if (dato == null || dato.isEmpty()) {
            return false;
        }
        boolean valido = false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !valido) {
                    valido = true;
                } else {
                    return false;
                }
            }
        }
        return valido;
    }

    /**
     * Evalua si la cadena cumple con el formato solicitado (Pagina 81).
     * @param dato Cadena a validar
     * @param tipo 1 para entero, 2 para decimal
     * @return true si es valido segun el tipo, false en caso contrario
     */
    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1:
                valido = EsNumeroEntero(dato);
                break;
            case 2:
                valido = EsNumeroDouble(dato);
                break;
        }
        return valido;
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.5.3: EVALUAR NUMERICO");
        System.out.println("=================================================\n");

        System.out.println("--- Tipo 1: Validar como Numero Entero ---");
        System.out.println("EvaluarNumerico('45', 1)     -> " + EvaluarNumerico("45", 1));
        System.out.println("EvaluarNumerico('45.50', 1)  -> " + EvaluarNumerico("45.50", 1));
        System.out.println("EvaluarNumerico('abc', 1)    -> " + EvaluarNumerico("abc", 1));

        System.out.println("\n--- Tipo 2: Validar como Numero Decimal ---");
        System.out.println("EvaluarNumerico('45.50', 2)  -> " + EvaluarNumerico("45.50", 2));
        System.out.println("EvaluarNumerico('35', 2)     -> " + EvaluarNumerico("35", 2));
        System.out.println("EvaluarNumerico('12.3.4', 2) -> " + EvaluarNumerico("12.3.4", 2));
    }
}
