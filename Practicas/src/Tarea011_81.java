/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_81 - Comparar Subcadenas de 3 Caracteres y 4 Caracteres
 * Descripcion: Contar y comparar el nÃºmero de apariciones de una subcadena de 3 letras frente a una de 4 letras en un texto.
 */
public class Tarea011_81 {
    public static void main(String[] args) {
        String texto = "redcapmanblue";
        System.out.println("Cadena analizada: " + texto);

        boolean igualConteo = compararSubcadenas(texto, "red", "blue");
        System.out.println("Â¿Aparecen 'red' y 'blue' la misma cantidad de veces-: " + igualConteo);
    }

    public static boolean compararSubcadenas(String s, String sub1, String sub2) {
        int c1 = 0, c2 = 0;
        int idx = 0;
        while ((idx = s.indexOf(sub1, idx)) != -1) { c1++; idx += sub1.length(); }
        idx = 0;
        while ((idx = s.indexOf(sub2, idx)) != -1) { c2++; idx += sub2.length(); }
        return c1 == c2;
    }
}
