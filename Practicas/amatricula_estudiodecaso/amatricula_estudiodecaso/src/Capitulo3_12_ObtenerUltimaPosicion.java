/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_12_ObtenerUltimaPosicion.java
 * Referencia: Capitulo 3 - Seccion 3.6.3 (Paginas 89-91)
 * Descripcion: Funcion que identifica la ultima posicion no vacia en una matriz bidimensional
 * de cadenas, permitiendo insertar nuevos registros sin sobreescribir los existentes.
 */
public class Capitulo3_12_ObtenerUltimaPosicion {

    /**
     * Devuelve el indice de la ultima fila con datos en la matriz (Pagina 91).
     * @param matriz Matriz bidimensional de cadenas
     * @return Indice de la ultima fila ocupada, o -1 si esta totalmente vacia
     */
    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int ultimaPosicion = -1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] != null && !matriz[i][0].isEmpty()) {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.6.3: OBTENER ULTIMA POSICION");
        System.out.println("=================================================\n");

        // Declaracion de una matriz de 10 filas x 4 columnas (modelo de productos)
        String[][] inventario = new String[10][4];

        System.out.println("1. Matriz recien creada (vacia):");
        System.out.println("   Ultima posicion ocupada: " + ObtenerUltimaPosicion(inventario));

        // Insertamos 3 productos
        inventario[0][0] = "001"; inventario[0][1] = "Arroz 1kg";  inventario[0][2] = "35"; inventario[0][3] = "10";
        inventario[1][0] = "002"; inventario[1][1] = "Azucar 1kg"; inventario[1][2] = "25"; inventario[1][3] = "10";
        inventario[2][0] = "003"; inventario[2][1] = "Harina 1kg"; inventario[2][2] = "28"; inventario[2][3] = "10";

        System.out.println("\n2. Matriz con 3 productos ingresados (filas 0, 1 y 2):");
        int ultima = ObtenerUltimaPosicion(inventario);
        System.out.println("   Ultima posicion ocupada: " + ultima);
        System.out.println("   Proxima posicion libre para insertar: " + (ultima + 1));
    }
}
