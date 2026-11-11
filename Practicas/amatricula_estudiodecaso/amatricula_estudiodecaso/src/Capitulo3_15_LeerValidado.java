import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_15_LeerValidado.java
 * Referencia: Capitulo 3 - Actividad 3.9.7 (Pagina 105)
 * Descripcion: Funcion robusta LeerValidado que integra la solicitud de datos (Dialogo),
 * la limpieza de espacios (trim) y la validacion de tipo en un bucle continuo de reintento.
 * Si el usuario introduce un dato incorrecto, muestra un mensaje de error y vuelve a solicitarlo.
 */
public class Capitulo3_15_LeerValidado {

    public static String Dialogo(String texto) throws IOException {
        System.out.print(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        return lectura.readLine();
    }

    public static boolean EsNumeroEntero(String valor) {
        if (valor == null || valor.isEmpty()) return false;
        for (char c : valor.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static boolean EsNumeroDouble(String valor) {
        if (valor == null || valor.isEmpty()) return false;
        boolean punto = false;
        for (char c : valor.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !punto) {
                    punto = true;
                } else {
                    return false;
                }
            }
        }
        return true; // Puede ser entero o decimal
    }

    /**
     * Actividad 3.9.7: Funcion que lee y valida datos con bucle de reintento (Pagina 105).
     * @param texto_dialogo Mensaje que se muestra en consola
     * @param tipo_dato "entero", "decimal" o "texto"
     * @return El dato ya validado y limpio
     * @throws IOException Si ocurre un error de lectura
     */
    public static String LeerValidado(String texto_dialogo, String tipo_dato) throws IOException {
        String datoLimpio = null;
        boolean esValido = false;

        while (!esValido) {
            datoLimpio = Dialogo(texto_dialogo);
            if (datoLimpio != null) {
                datoLimpio = datoLimpio.trim();
            }

            if (datoLimpio == null || datoLimpio.isEmpty()) {
                System.out.println(">> Error: No se puede dejar el campo vacio. Intente de nuevo.\n");
                continue;
            }

            if (tipo_dato.equalsIgnoreCase("entero")) {
                if (EsNumeroEntero(datoLimpio)) {
                    esValido = true;
                } else {
                    System.out.println(">> Error: '" + datoLimpio + "' no es un numero entero valido. Intente de nuevo.\n");
                }
            } else if (tipo_dato.equalsIgnoreCase("decimal")) {
                if (EsNumeroDouble(datoLimpio)) {
                    esValido = true;
                } else {
                    System.out.println(">> Error: '" + datoLimpio + "' no es un numero decimal valido. Intente de nuevo.\n");
                }
            } else {
                // Tipo texto u otro
                esValido = true;
            }
        }

        return datoLimpio;
    }

    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("  CAPITULO 3 - ACTIVIDAD 3.9.7: FUNCION LEER VALIDADO");
        System.out.println("==================================================================\n");

        try {
            System.out.println("Demostracion de captura validada:");
            String cantidad = LeerValidado("Introduce la cantidad de stock (Entero)", "entero");
            System.out.println("-> Cantidad aceptada con exito: " + cantidad);

            String precio = LeerValidado("\nIntroduce el precio del producto (Decimal)", "decimal");
            System.out.println("-> Precio aceptado con exito: " + precio);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
