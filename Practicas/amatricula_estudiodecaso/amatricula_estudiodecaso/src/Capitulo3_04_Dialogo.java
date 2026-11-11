import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_04_Dialogo.java
 * Referencia: Capitulo 3 - Seccion 3.4.1 (Pagina 68)
 * Descripcion: Funcion que establece un canal de comunicacion interactiva con el usuario,
 * imprimiendo una etiqueta y leyendo una linea de texto ingresada por teclado.
 */
public class Capitulo3_04_Dialogo {

    /**
     * Solicita una entrada al usuario en la consola y retorna el valor ingresado.
     * @param texto Mensaje de solicitud para el usuario
     * @return Cadena ingresada por el usuario
     * @throws IOException Si ocurre un error de lectura en consola
     */
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.print(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.4.1: FUNCION DIALOGO");
        System.out.println("=================================================\n");

        try {
            System.out.println("Prueba de captura interactiva con Dialogo:");
            String respuesta = Dialogo("Introduce el precio de Aceite 1L");
            System.out.println("Cadena capturada: [" + respuesta + "]");
        } catch (IOException e) {
            System.out.println("Error al leer datos: " + e.getMessage());
        }
    }
}
