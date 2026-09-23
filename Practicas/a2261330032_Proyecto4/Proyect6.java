import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Proyect6 {
    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("altura de la torre ");
        int torre = Integer.parseInt(leer.readLine());
        
        System.out.print("altura de la biblioteca");
        int biblioteca = Integer.parseInt(leer.readLine());
        
        double Numerodeveces = (torre / biblioteca);
        int r = (int) Math.ceil(Numerodeveces);
        
        System.out.println("el numero de veces es " + r );
    }
}