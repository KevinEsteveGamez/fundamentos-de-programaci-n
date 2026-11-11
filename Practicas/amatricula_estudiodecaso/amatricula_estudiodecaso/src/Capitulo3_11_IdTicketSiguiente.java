/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_11_IdTicketSiguiente.java
 * Referencia: Capitulo 3 - Seccion 3.6.2 (Paginas 87-88)
 * Descripcion: Funcion que genera el siguiente identificador correlativo de ticket
 * garantizando el formato de 3 digitos con ceros a la izquierda (ej. 001, 010, 100).
 */
public class Capitulo3_11_IdTicketSiguiente {

    /**
     * Calcula y formatea el siguiente ID de ticket (Pagina 88).
     * @param idticket ID del ticket actual (ej. "000", "089")
     * @return Siguiente ID en formato correlativo de 3 digitos
     */
    public static String IdTicketSiguiente(String idticket) {
        String idticketnext = "";
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            idticketnext = "00" + String.valueOf(num).trim();
        } else if ((num > 9) && (num < 100)) {
            idticketnext = "0" + String.valueOf(num).trim();
        } else {
            idticketnext = String.valueOf(num).trim();
        }
        return idticketnext;
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.6.2: ID TICKET SIGUIENTE");
        System.out.println("=================================================\n");

        String[] ticketsActuales = {"000", "001", "009", "089", "099", "150"};

        for (String ticket : ticketsActuales) {
            String siguiente = IdTicketSiguiente(ticket);
            System.out.printf("Ticket actual: '%-5s' -> Siguiente ticket correlativo: '%s'\n", ticket, siguiente);
        }
    }
}
