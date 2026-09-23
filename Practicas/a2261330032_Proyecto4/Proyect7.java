import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Proyect7 {
    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Dame los 12 numeros (presiona Enter despues de cada uno):");
        
        int n11 = Integer.parseInt(leer.readLine());
        int n12 = Integer.parseInt(leer.readLine());
        int n13 = Integer.parseInt(leer.readLine());
        int n14 = Integer.parseInt(leer.readLine());
        
        // Fila 
        int n21 = Integer.parseInt(leer.readLine());
        int n22 = Integer.parseInt(leer.readLine());
        int n23 = Integer.parseInt(leer.readLine());
        int n24 = Integer.parseInt(leer.readLine());
        
        int n31 = Integer.parseInt(leer.readLine());
        int n32 = Integer.parseInt(leer.readLine());
        int n33 = Integer.parseInt(leer.readLine());
        int n34 = Integer.parseInt(leer.readLine());
        
        // Suma del contorno (omitiendo n22 y n23, como en tu código original)
        int suma = n11 + n12 + n13 + n14 + n21 + n34 + n33 + n32 + n31 + n24;

        System.out.println("La suma da " + suma);
    }
}