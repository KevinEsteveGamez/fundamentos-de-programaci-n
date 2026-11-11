import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_13_Fecha.java
 * Referencia: Capitulo 3 - Seccion 3.7 (Paginas 92-95)
 * Descripcion: Funcion que obtiene la fecha actual del sistema operativo y la formatea
 * como una cadena "dd-MM-yyyy" para su utilizacion en tickets y reportes.
 */
public class Capitulo3_13_Fecha {

    /**
     * Obtiene la fecha actual en formato dia-mes-ano (Pagina 95).
     * @return Cadena con la fecha formateada (ej. "10-11-2026")
     */
    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.7: FUNCION FECHA");
        System.out.println("=================================================\n");

        String fechaActual = Fecha();
        System.out.println("Fecha actual del sistema: " + fechaActual);

        // Ejemplo de uso en el membrete de un ticket:
        System.out.println("\nEjemplo de membrete de ticket:");
        System.out.println("---------------------------------------------");
        System.out.println("Fecha del Dia: " + fechaActual + "   Ticket No: 001");
        System.out.println("---------------------------------------------");
    }
}
