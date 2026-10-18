import java.util.Calendar;

/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_15 - Imprimir Fecha y Hora Actual con Formato
 * Descripcion: Formatear e imprimir la fecha y hora actual del sistema utilizando String.format() y Calendar.
 */

public class Tarea011_15 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        System.out.println("Fecha y hora actual:");
        System.out.format("%tB %te, %tY%n", calendario, calendario, calendario);
        System.out.format("%tl:%tM %tp%n", calendario, calendario, calendario);
    }
}
