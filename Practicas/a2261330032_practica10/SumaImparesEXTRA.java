package a2261330032_practica10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumaImparesEXTRA {

    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

  
    public static int sumarNumerosImpares(int n) {
        int suma = 0;
        int numeroImpar = 1;
        
        for (int i = 0; i < n; i++) {
            suma += numeroImpar;
            numeroImpar += 2;
        }
        
        return suma;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("--- Suma de los primeros N números impares ---");
        
        System.out.print("Ingrese la cantidad de números impares a sumar (n): ");
        int n = Integer.parseInt(lectura.readLine());

        if (n <= 0) {
            System.out.println("Por favor, ingrese un número mayor a 0.");
        } else {
            int resultado = sumarNumerosImpares(n);
            System.out.println("La suma de los primeros " + n + " números impares es: " + resultado);
        }
    }
}