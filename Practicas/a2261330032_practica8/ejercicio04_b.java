package a2261330032_practica8;
import java.util.Scanner;
public class ejercicio04_b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el valor del operando 1:");
        double operando1 = entrada.nextDouble();
        System.out.println("Introduce el valor del operando 2:");
        double operando2 = entrada.nextDouble();
        System.out.println("1.- Suma\n2.- Multiplicacion\n3.- Division\nElige una Opcion:");
        int opcion = entrada.nextInt();
        String cadena = "";
        switch (opcion) {
            case 1: cadena="Suma: " + (operando1+operando2); break;
            case 2: cadena="Multiplicacion: " + (operando1*operando2); break;
            case 3: cadena="Division: " + (operando1/operando2); break;
            default: cadena="Opcion no reconocida";
        }
        System.out.println(cadena);
    }
}