public class Digitos {
    public static void main(String[] args) {
    	 System.out.print("Dame un numero de 4 digitos ");
         int nu = Integer.parseInt(leer.readLine());
         
        int n11 = 1, n12 = 2, n13 = 3, n14 = 4;
        
        int n21 = 5, n22 = 6, n23 = 7, n24 = 8;
   
        int n31 = 9, n32 = 10, n33 = 11, n34 = 12;

  
        int suma = n11 + n12 + n13 + n14 + n21 + n34 + n33 + n32 + n31 + n24;

        System.out.println("La suma da " + suma);
    }
}