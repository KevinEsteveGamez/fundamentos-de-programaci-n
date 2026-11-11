/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_07_EsNumeroEntero.java
 * Referencia: Capitulo 3 - Seccion 3.5.1 (Paginas 74-76)
 * Descripcion: Funcion que valida si una cadena de texto representa un numero entero valido.
 * Utiliza los metodos toCharArray() y Character.isDigit().
 */
public class Capitulo3_07_EsNumeroEntero {

    /**
     * Valida si todos los caracteres de la cadena son digitos numericos (Pagina 76).
     * @param dato Cadena a evaluar
     * @return true si es entero, false en caso contrario
     */
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

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.5.1: ES NUMERO ENTERO");
        System.out.println("=================================================\n");

        String[] casosDePrueba = {
            "123",
            "0",
            "4500",
            "12a3",
            "12.34",
            "-50",
            "abc",
            ""
        };

        for (String caso : casosDePrueba) {
            boolean resultado = EsNumeroEntero(caso);
            System.out.printf("Dato: '%-8s' -> EsNumeroEntero: %s\n", caso, resultado);
        }
    }
}
