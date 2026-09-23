import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumaDigitos {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese un número de 3 cifras: ");
        int num = Integer.parseInt(lector.readLine());
        
        num = Math.abs(num); 
        
        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;
        
        int suma = 0;
        
        if (d1 % 2 == 0) suma += d1;
        if (d2 % 2 == 0) suma += d2;
        if (d3 % 2 == 0) suma += d3;
        
        System.out.println("La suma de los dígitos pares es: " + suma);
    }
}