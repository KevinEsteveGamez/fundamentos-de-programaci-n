/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_08_EsNumeroDouble.java
 * Referencia: Capitulo 3 - Seccion 3.5.2 (Paginas 77-78)
 * Descripcion: Funcion que valida si una cadena de texto representa un numero decimal valido,
 * permitiendo unicamente digitos y a lo sumo un solo punto decimal.
 */
public class Capitulo3_08_EsNumeroDouble {

    /**
     * Valida si la cadena representa un numero decimal (Pagina 78).
     * @param dato Cadena a evaluar
     * @return true si es decimal valido, false en caso contrario
     */
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

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.5.2: ES NUMERO DOUBLE");
        System.out.println("=================================================\n");

        String[] casosDePrueba = {
            "123.45",
            "0.99",
            "50.0",
            "12ab.45",
            "12.34.56",
            "100",
            ".",
            "texto"
        };

        for (String caso : casosDePrueba) {
            boolean resultado = EsNumeroDouble(caso);
            System.out.printf("Dato: '%-10s' -> EsNumeroDouble: %s\n", caso, resultado);
        }
    }
}
