import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Proyect10 {
    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("cantidad total de días: ");
        int diasTotales = Integer.parseInt(leer.readLine());
        
        int semanas = diasTotales / 7;
        int diasSobrantes = diasTotales % 7;
        
        System.out.println(diasTotales + " días equivalen a " + semanas + " semanas y " + diasSobrantes + " días.");
    }
}