import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Proyrct1 {
    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Número de sastres que trabajan en el día: ");
        int sastres = Integer.parseInt(leer.readLine());
        
        double pantalones = (sastres * 45.0) / 25.0;
        
        System.out.println("Con " + sastres + " sastres trabajando, se fabricarán " + pantalones + " pantalones en un día.");
    }
}