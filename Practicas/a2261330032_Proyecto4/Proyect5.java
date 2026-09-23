import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Proyect5 {
    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("numero de venta ");
        int venta = Integer.parseInt(leer.readLine());
        
     
        
        double ganancia = (venta * 0.2);
        int r = (int) Math.ceil(ganancia);
        
        System.out.println("La ganancia es de " + r );
    }
}