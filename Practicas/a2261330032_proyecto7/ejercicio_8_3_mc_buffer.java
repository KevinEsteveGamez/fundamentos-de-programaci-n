import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_3_mc_buffer {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el lado 1:");
        double l1 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el lado 2:");
        double l2 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el lado 3:");
        double l3 = Double.parseDouble(entrada.readLine());

        if (l1 == l2) {
            if (l2 == l3) {
                System.out.println("Triangulo Equilatero");
            } else {
                System.out.println("Triangulo Isosceles");
            }
        } else {
            if (l1 == l3 || l2 == l3) {
                System.out.println("Triangulo Isosceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }
        }
    }
}