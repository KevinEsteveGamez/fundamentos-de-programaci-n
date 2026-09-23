import java.io.*;
public class Ganancia_Inversion {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
double capital = Double.parseDouble(br.readLine());
int dias = Integer.parseInt(br.readLine());
System.out.println("La ganancia es: " + (capital * dias * 0.02));
}
}