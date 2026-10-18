/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_89 - Sumar los NÃºmeros Enteros Presentes en una Cadena
 * Descripcion: Calcular la suma total de todos los nÃºmeros enteros embebidos dentro de un texto mixto.
 */
public class Tarea011_89 {
    public static void main(String[] args) {
        String texto = "it 15 is25 a 20string";
        System.out.println("Cadena original: " + texto);

        int suma = sumarNumerosEnCadena(texto);
        System.out.println("La suma de los nÃºmeros es: " + suma);
    }

    public static int sumarNumerosEnCadena(String s) {
        int suma = 0;
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                actual.append(c);
            } else {
                if (actual.length() > 0) {
                    suma += Integer.parseInt(actual.toString());
                    actual.setLength(0);
                }
            }
        }
        if (actual.length() > 0) {
            suma += Integer.parseInt(actual.toString());
        }
        return suma;
    }
}
