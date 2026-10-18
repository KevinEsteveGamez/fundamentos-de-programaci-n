/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_21 - Obtener el �sltimo Índice de un Carácter o Subcadena
 * Descripcion: Localizar la última aparición de un carácter o subcadena utilizando lastIndexOf().
 */
public class Tarea011_21 {
    public static void main(String[] args) {
        String cadena = "El veloz murciélago comía feliz cardillo.";
        System.out.println("Cadena original: " + cadena);

        int ultimoIndiceA = cadena.lastIndexOf('a');
        int ultimoIndiceO = cadena.lastIndexOf('o');

        System.out.println("�sltimo índice de 'a': " + ultimoIndiceA);
        System.out.println("�sltimo índice de 'o': " + ultimoIndiceO);
    }
}
