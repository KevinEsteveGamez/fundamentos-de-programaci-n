package a2261330032_practica10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculoAreas {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static String mostrarMenu() throws IOException {
        System.out.println("\n--- Menú de Áreas ---");
        System.out.println("C.- Calcular área del círculo");
        System.out.println("T.- Calcular área del triángulo");
        System.out.println("R.- Calcular área del rectángulo");
        System.out.println("P.- Calcular área del trapecio");
        System.out.println("S.- Salir");
        System.out.print("Elige una opción: ");
        return lectura.readLine().toUpperCase();
    }

    public static double pedirDato(String mensaje) throws IOException {
        System.out.print(mensaje);
        return Double.parseDouble(lectura.readLine());
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    public static void main(String[] args) throws IOException {
        String opcion = mostrarMenu(); 
        
        while (!opcion.equals("S")) {
            switch (opcion) {
                case "C":
                    double radio = pedirDato("Ingresa el radio del círculo: ");
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                    break;
                case "T":
                    double baseT = pedirDato("Ingresa la base del triángulo: ");
                    double alturaT = pedirDato("Ingresa la altura del triángulo: ");
                    System.out.println("El área del triángulo es: " + calcularAreaTriangulo(baseT, alturaT));
                    break;
                case "R":
                    double baseR = pedirDato("Ingresa la base del rectángulo: ");
                    double alturaR = pedirDato("Ingresa la altura del rectángulo: ");
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(baseR, alturaR));
                    break;
                case "P":
                    double bMayor = pedirDato("Ingresa la base mayor del trapecio: ");
                    double bMenor = pedirDato("Ingresa la base menor del trapecio: ");
                    double alturaP = pedirDato("Ingresa la altura del trapecio: ");
                    System.out.println("El área del trapecio es: " + calcularAreaTrapecio(bMayor, bMenor, alturaP));
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            opcion = mostrarMenu(); 
        }
        System.out.println("Saliendo del programa.");
    }
}