/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_73 - Extraer Subcadena Antes de un Punto
 * Descripcion: Obtener la porciÃ³n de texto que precede al carÃ¡cter de punto '.' en una cadena de nombres de archivo o dominios.
 */
public class Tarea011_73 {
    public static void main(String[] args) {
        String archivo = "documento_importante.pdf";
        System.out.println("Nombre completo: " + archivo);

        String antesDelPunto = obtenerAntesDelPunto(archivo);
        System.out.println("Texto antes del punto: " + antesDelPunto);
    }

    public static String obtenerAntesDelPunto(String s) {
        int idx = s.indexOf('.');
        return idx != -1 ? s.substring(0, idx) : s;
    }
}
