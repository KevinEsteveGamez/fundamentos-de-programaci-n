import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Proyect2 {
    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Cantidad de obreros trabajando: ");
        int obreros = Integer.parseInt(leer.readLine());
        
        System.out.print("Cantidad de días de trabajo: ");
        int dias = Integer.parseInt(leer.readLine());
        
        double motores = (obreros * dias * 30) / (48 * 10);
        
        System.out.println("Con " + obreros + " obreros en " + dias + " días, se ensamblan: " + motores + " motores.");
    }
}