package a2261330032_practica8;
import java.util.Scanner;
public class ejercicio01_b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número (0 a 99): ");
        int num = entrada.nextInt();
        int unidades = num % 10;
        int decenas = num / 10;
        String cadena = "";
        switch(decenas){
            case 1: cadena="diez"; break;
            case 2: cadena="veinte"; break;
        }
        switch(unidades){
            case 1: if(decenas==1) cadena="once"; else if(decenas>1) cadena=cadena+" y uno"; else cadena="uno"; break;
            case 2: if(decenas==1) cadena="doce"; else if(decenas>1) cadena=cadena+" y dos"; else cadena="dos"; break;
        }
        System.out.println(cadena);
    }
}