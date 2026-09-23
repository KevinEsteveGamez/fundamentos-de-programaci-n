package a13_practica6;
import java.util.Scanner;

public class ejercicio04_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, dm, um, c, d, u;
        String salida;

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = entrada.nextInt();

        u = num % 10;
        num = num / 10;
        d = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        um = num % 10;
        num = num / 10;
        dm = num;

        salida = u + " " + d + " " + c + " " + um + " " + dm;
        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        salida = salida + "\n" + num;

        System.out.println(salida);
    }
}