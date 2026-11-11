import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_06_Leer.java
 * Referencia: Capitulo 3 - Seccion 3.5 (Paginas 72-73)
 * Descripcion: Funcion que lee una cadena de texto, limpia espacios sobrantes al inicio
 * y al final (trim) y devuelve null si la entrada queda vacia o nula.
 */
public class Capitulo3_06_Leer {

    /**
     * Metodo auxiliar para captura por consola (Pagina 68).
     */
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.print(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    /**
     * Lee la entrada del usuario, la limpia con trim() y comprueba nulos/vacios (Pagina 73).
     * @param texto Mensaje que se muestra al usuario
     * @return Cadena limpia o null si esta vacia
     * @throws IOException Si ocurre un error de lectura
     */
    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        } else {
            cadena = null;
        }
        return cadena;
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.5: FUNCION LEER");
        System.out.println("=================================================\n");

        try {
            System.out.println("Ingrese un texto (puede contener espacios al inicio/final o presionar Enter en blanco):");
            String valor = Leer("Introduce un dato");
            if (valor == null) {
                System.out.println("Resultado: Se retorno NULL (entrada vacia o solo espacios).");
            } else {
                System.out.println("Resultado: Cadena limpia obtenida: '" + valor + "'");
            }
        } catch (IOException e) {
            System.out.println("Error de entrada: " + e.getMessage());
        }
    }
}
