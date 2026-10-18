/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_95 - Sumar los Dígitos Individuales Presentes en una Cadena
 * Descripcion: Calcular la suma de todos los dígitos numéricos individuales (del 0 al 9) embebidos en una cadena.
 */
public class Tarea011_95 {
    public static void main(String[] args) {
        String texto = "ab5c2d4ef12";
        System.out.println("Cadena original: " + texto);

        int suma = sumarDigitosIndividuales(texto);
        System.out.println("La suma de los dígitos individuales es: " + suma);
    }

    public static int sumarDigitosIndividuales(String s) {
        int suma = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                suma += c - '0';
            }
        }
        return suma;
    }
}
