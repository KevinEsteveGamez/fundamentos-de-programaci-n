package a2261330032_practica8;
import java.util.Scanner;
public class ejercicio02_b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("1.-Opcion 1\n2.-Opcion 2\n3.-Opcion 3\n4.-Opcion 4\nEliga una opcion [1..4]--> ");
        int num = entrada.nextInt();
        String cadena = "";
        switch(num){
            case 1: cadena="Elegiste la opcion 1"; break;
            case 2: cadena="Elegiste la opcion 2"; break;
            case 3: cadena="Elegiste la opcion 3"; break;
            case 4: cadena="Elegiste la opcion 4"; break;
            default: cadena="Elegiste una opcion que no existe"; break;
        }
        System.out.println("\n" + cadena);
    }
}