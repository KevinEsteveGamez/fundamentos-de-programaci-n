import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class impares {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Pares = 0;
        int Impares = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el número " + i );
            int num = Integer.parseInt(reader.readLine());

            if (num % 2 == 0) {
                Pares++;
            }
            
            if (num % 2 != 0 && num > 0) {
                Impares++;
            }
        }

        System.out.println("pares " + Pares);
        System.out.println("impares " + Impares);
    }
}