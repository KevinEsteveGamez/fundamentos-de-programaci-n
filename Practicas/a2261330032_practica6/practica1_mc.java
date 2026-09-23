package a13_practica6;
import java.io.*;

public class practica1_mc {
    public static void main(String args[]) throws Exception {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double altura, area, base;
        
        System.out.println("Introduce la Base");
        base = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce la Altura");
        altura = Double.parseDouble(entrada.readLine());
        
        area = base * altura;
        System.out.println("el area es " + area);
    }
}