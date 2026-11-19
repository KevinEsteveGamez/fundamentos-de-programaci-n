import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Proyecto: a2261330032_puntoventa2
 * Tarea 13: Desarrollar el sistema de menu y solo lo operativo (Punto de Venta 2)
 * Matricula: 2261330032
 *
 * Descripcion:
 * Sistema de navegacion por menus interactivos en modo consola utilizando
 * las funciones de apoyo del Capitulo 3 (MostrarMenu, Dialogo, DesplegarMenu,
 * Leer, Validaciones, Rellenarespacios, IdTicketSiguiente, ObtenerUltimaPosicion, Fecha)
 * y la estructura de control y submenus basada en el Capitulo 4.
 * Unicamente opera los menus y sus opciones correspondientes sin logica de negocio adicional.
 */
public class PuntoVenta2 {

    // Lector compartido de entrada estandar para evitar perdida de buffer en consola
    private static final BufferedReader LECTURA_CONSOLA = new BufferedReader(new InputStreamReader(System.in));

    // =========================================================================
    // METODOS DE APOYO DEL LIBRO - CAPITULO 3
    // =========================================================================

    /**
     * Genera una cadena visual con las opciones del menu separadas por salto de linea.
     * Basado en el Capitulo 3, Seccion 3.3.1 (bucle for-each mejorado).
     *
     * @param opciones Arreglo con las opciones del menu
     * @return Cadena concatenada con las opciones
     */
    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (String info : opciones) {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    /**
     * Muestra un mensaje personalizado en consola y lee una linea ingresada por teclado.
     * Basado en el Capitulo 3, Seccion 3.4.1.
     *
     * @param texto Mensaje que se presenta al usuario
     * @return Cadena introducida por el usuario
     * @throws IOException Si ocurre un error de entrada/salida
     */
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.print(texto + " : ");
        cadena = LECTURA_CONSOLA.readLine();
        return cadena;
    }

    /**
     * Lee la entrada del usuario mediante Dialogo, elimina espacios exteriores
     * con trim() y devuelve null si la cadena es nula o esta vacia.
     * Basado en el Capitulo 3, Seccion 3.5.
     *
     * @param texto Mensaje a mostrar al usuario
     * @return Cadena limpia o null si esta vacia
     * @throws IOException Si ocurre un error de lectura
     */
    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        } else {
            cadena = null;
        }
        return cadena;
    }

    /**
     * Combina el titulo del menu, el listado de opciones y solicita la eleccion del usuario.
     * Basado en el Capitulo 3, Seccion 3.4.2.
     *
     * @param Titulo1 Encabezado del menu
     * @param menu Arreglo con las opciones disponibles
     * @return Opcion elegida (limpia) o null si no se introdujo nada
     * @throws IOException Si ocurre un error de entrada/salida
     */
    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = "\n=======================================\n";
        cadena = cadena + Titulo1 + "\n";
        cadena = cadena + "=======================================\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "=======================================\n";
        cadena = cadena + "Que opcion deseas";
        return Leer(cadena);
    }

    /**
     * Valida si una cadena representa un numero entero valido.
     * Basado en el Capitulo 3, Seccion 3.5.1.
     */
    public static boolean EsNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty()) {
            return false;
        }
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Valida si una cadena representa un numero decimal valido.
     * Basado en el Capitulo 3, Seccion 3.5.2.
     */
    public static boolean EsNumeroDouble(String dato) {
        if (dato == null || dato.isEmpty()) {
            return false;
        }
        boolean valido = false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !valido) {
                    valido = true;
                } else {
                    return false;
                }
            }
        }
        return valido;
    }

    /**
     * Determina si una cadena es numerica segun el tipo solicitado (1 = entero, 2 = decimal).
     * Basado en el Capitulo 3, Seccion 3.5.3.
     */
    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1:
                valido = EsNumeroEntero(dato);
                break;
            case 2:
                valido = EsNumeroDouble(dato);
                break;
        }
        return valido;
    }

    /**
     * Rellena una cadena con espacios a la derecha hasta completar un tamano fijo.
     * Basado en el Capitulo 3, Seccion 3.6.1.
     */
    public static String Rellenarespacios(String dato, int tamano) {
        return String.format("%1$-" + tamano + "s", dato);
    }

    /**
     * Genera el siguiente identificador correlativo de ticket con formato de 3 digitos.
     * Basado en el Capitulo 3, Seccion 3.6.2.
     *
     * @param idticket Folio actual del ticket
     * @return Siguiente folio formateado (ej. "001")
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

    /**
     * Devuelve el indice de la ultima fila ocupada en una matriz bidimensional.
     * Basado en el Capitulo 3, Seccion 3.6.3.
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

    /**
     * Obtiene la fecha actual del sistema en formato "dd-MM-yyyy".
     * Basado en el Capitulo 3, Seccion 3.7.
     *
     * @return Fecha formateada como cadena
     */
    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    // =========================================================================
    // SUBMENUS OPERATIVOS DEL SISTEMA - BASADOS EN CAPITULO 4 Y DOCUMENTO POS 2
    // =========================================================================

    /**
     * Opcion 1 del Menu Principal: Gestion de Categorias.
     */
    public static void MenuCategorias() throws IOException {
        String[] datosmenucategorias = {
            "1. Alta de Categorias",
            "2. Modificacion de Categorias",
            "3. Listado de Categorias",
            "4. Salida"
        };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE CATEGORIAS", datosmenucategorias);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Alta de Categorias");
                        break;
                    case "2":
                        System.out.println("Modificacion de Categorias");
                        break;
                    case "3":
                        System.out.println("Listado de Categorias");
                        break;
                    case "4":
                        System.out.println("Salida de Gestion de Categorias");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("4") != 0);
    }

    /**
     * Opcion 2 del Menu Principal: Gestion de Productos.
     */
    public static void MenuProductos() throws IOException {
        String[] datosmenuproductos = {
            "1. Agregar Producto",
            "2. Modificar Producto",
            "3. Listado de Productos",
            "4. Salida"
        };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE PRODUCTOS", datosmenuproductos);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Agregar Producto");
                        break;
                    case "2":
                        System.out.println("Modificar Producto");
                        break;
                    case "3":
                        System.out.println("Listado de Productos");
                        break;
                    case "4":
                        System.out.println("Salida de Gestion de Productos");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("4") != 0);
    }

    /**
     * Opcion 3 del Menu Principal: Punto de Venta.
     * Utiliza Fecha() e IdTicketSiguiente() del Capitulo 3 y el control de pago del Capitulo 4.
     *
     * @param idticket Ultimo folio de ticket registrado
     */
    public static void MenuPuntoVenta(String idticket) throws IOException {
        String opcion = "0";
        String membrete;
        Boolean pago = false;

        idticket = IdTicketSiguiente(idticket);
        String fechadia = Fecha();

        membrete = "PUNTO DE VENTA\n"
                 + "Fecha del Dia: " + fechadia + "   Ticket No: " + idticket + "\n"
                 + "---------------------------------------\n"
                 + "Opciones del Ticket:";

        String[] datosmenupuntoventa = {
            "1. Agregar Producto",
            "2. Eliminar Producto",
            "3. Pagar Ticket",
            "4. Cancelar Venta (Salir)"
        };

        do {
            opcion = DesplegarMenu(membrete, datosmenupuntoventa);
            if (opcion == null) {
                System.out.println("dato incorrecto introducido");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Agregar Producto al Ticket");
                        break;
                    case "2":
                        System.out.println("Eliminar Producto del Ticket");
                        break;
                    case "3":
                        System.out.println("Pagar Ticket y salir");
                        opcion = "4";
                        pago = true;
                        break;
                    case "4":
                        System.out.println("Salida de Punto de Venta");
                        if (!pago) {
                            System.out.println("No pago el ticket");
                            System.out.println("eliminando ticket " + idticket);
                        }
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("4") != 0);
    }

    /**
     * Opcion 4 del Menu Principal: Gestion de Inventario.
     */
    public static void MenuInventario() throws IOException {
        String[] datosmenuinventario = {
            "1. Agregar Stock (Entrada de Almacen)",
            "2. Ajustar/Eliminar Stock (Salida/Baja)",
            "3. Listado de Inventario",
            "4. Salida"
        };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE INVENTARIOS", datosmenuinventario);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Agregar Stock (Entrada de Almacen)");
                        break;
                    case "2":
                        System.out.println("Ajustar/Eliminar Stock (Salida/Baja)");
                        break;
                    case "3":
                        System.out.println("Listado de Inventario");
                        break;
                    case "4":
                        System.out.println("Salida de Gestion de Inventarios");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("4") != 0);
    }

    /**
     * Opcion 5 del Menu Principal: Modulo de Ventas y Reportes.
     */
    public static void MenuReportes() throws IOException {
        String[] datosmenureportes = {
            "1. Reporte de Ventas (Corte de Caja)",
            "2. Reporte de Productos Mas Vendidos",
            "3. Reporte de Valor de Inventario",
            "4. Reporte de Impuestos Cobrados",
            "5. Reporte de Devoluciones",
            "6. Salida"
        };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("MODULO DE REPORTES", datosmenureportes);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Reporte de Ventas (Corte de Caja)");
                        break;
                    case "2":
                        System.out.println("Reporte de Productos Mas Vendidos");
                        break;
                    case "3":
                        System.out.println("Reporte de Valor de Inventario");
                        break;
                    case "4":
                        System.out.println("Reporte de Impuestos Cobrados");
                        break;
                    case "5":
                        System.out.println("Reporte de Devoluciones");
                        break;
                    case "6":
                        System.out.println("Salida del Modulo de Reportes");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("6") != 0);
    }

    /**
     * Opcion 6 del Menu Principal: Gestion de Impuestos.
     */
    public static void MenuImpuestos() throws IOException {
        String[] datosmenuimpuestos = {
            "1. Alta de Impuesto",
            "2. Modificacion de Impuesto",
            "3. Listado de Impuestos",
            "4. Asignar Impuestos a Categorias",
            "5. Salida"
        };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE IMPUESTOS", datosmenuimpuestos);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Alta de Impuesto");
                        break;
                    case "2":
                        System.out.println("Modificacion de Impuesto");
                        break;
                    case "3":
                        System.out.println("Listado de Impuestos");
                        break;
                    case "4":
                        System.out.println("Asignar Impuestos a Categorias");
                        break;
                    case "5":
                        System.out.println("Salida de Gestion de Impuestos");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("5") != 0);
    }

    /**
     * Opcion 7 del Menu Principal: Gestion de Devoluciones.
     */
    public static void MenuDevoluciones() throws IOException {
        String[] datosmenudevoluciones = {
            "1. Realizar Devolucion (Cancelar Ticket Pagado)",
            "2. Listado de Devoluciones",
            "3. Salida"
        };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE DEVOLUCIONES", datosmenudevoluciones);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Realizar Devolucion (Cancelar Ticket Pagado)");
                        break;
                    case "2":
                        System.out.println("Listado de Devoluciones");
                        break;
                    case "3":
                        System.out.println("Salida de Gestion de Devoluciones");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("3") != 0);
    }

    /**
     * Opcion 8 del Menu Principal: Gestion de Proveedores.
     */
    public static void MenuProveedores() throws IOException {
        String[] datosmenuproveedores = {
            "1. Alta de Proveedor",
            "2. Modificacion de Proveedor",
            "3. Listado de Proveedores",
            "4. Salida"
        };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE PROVEEDORES", datosmenuproveedores);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Alta de Proveedor");
                        break;
                    case "2":
                        System.out.println("Modificacion de Proveedor");
                        break;
                    case "3":
                        System.out.println("Listado de Proveedores");
                        break;
                    case "4":
                        System.out.println("Salida de Gestion de Proveedores");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("4") != 0);
    }

    // =========================================================================
    // MENU PRINCIPAL DEL SISTEMA (9 MODULOS)
    // =========================================================================

    /**
     * Menu Principal del Punto de Venta 2. Controla la navegacion general hacia
     * todos los submenus operativos sin ejecutar logica de negocio.
     *
     * @throws IOException Si ocurre un error de entrada/salida
     */
    public static void MenuPrincipal() throws IOException {
        String[] datosmenuprincipal = {
            "1. Categorias",
            "2. Productos",
            "3. Punto de Venta",
            "4. Inventario",
            "5. Ventas y Reportes",
            "6. Gestion de Impuestos",
            "7. Devoluciones",
            "8. Proveedores",
            "9. Salida"
        };
        String opcion = "0";

        do {
            opcion = DesplegarMenu("TIENDA DE ABARROTES LA PEQUENA", datosmenuprincipal);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1":
                        MenuCategorias();
                        break;
                    case "2":
                        MenuProductos();
                        break;
                    case "3":
                        MenuPuntoVenta("000");
                        break;
                    case "4":
                        MenuInventario();
                        break;
                    case "5":
                        MenuReportes();
                        break;
                    case "6":
                        MenuImpuestos();
                        break;
                    case "7":
                        MenuDevoluciones();
                        break;
                    case "8":
                        MenuProveedores();
                        break;
                    case "9":
                        System.out.println("Salida del Sistema");
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("9") != 0);
    }

    // =========================================================================
    // PUNTO DE ENTRADA PRINCIPAL
    // =========================================================================

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
}
