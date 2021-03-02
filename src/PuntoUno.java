import java.util.Scanner;

public class PuntoUno {
    public static void main(String[] args) {
        // PRINTS Y SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("\033\143"); // LIMPIAR PANTALLA
        System.out.print("Digite cuantos datos quiere ingresar: ");// ENTRADA DE N DATOS POR EL USUARIO

        // VARIABLES
        int n = input.nextInt(); // ALMACENAMIENTO DE N
        String[] c_Productos = new String[n]; // DEFINIR VECTOR DE TAMAÑO N ELEMENTOS, DICHO POR EL USUARIO
        double[] v_Venta = new double[n]; // DEFINIR VECTOR DE TAMAÑO N ELEMENTOS, DICHO POR EL USUARIO
        int[] u_Vendidas = new int[n]; // DEFINIR VECTOR DE TAMAÑO N ELEMENTOS, DICHO POR EL USUARIO
        int t_ProductosVendidos = 0; // TOTAL DE PRODUCTOS VENDIDOS EN EL DIA
        double t_IngresosVentas = 0; // TOTAL DE INGRESOS POR VENTAS DEL DIA
        int mayor = 0; // EL PRODUCTO MAS VENDIDO
        double p_MasCostoso = 0; // EL PRODUCTO MAS COSTOSO VENDIDO
        int indice1 = 0; // INDICE DE AYUDA 1
        int indice2 = 0; // INDICE DE AYUDA 2

        // LLENADO DE VECTORES

        for (int i = 0; i < n; i++) { // 1.ER BUCLE PARA LLENADO
            System.out.printf("Digite el codigo o nombre del producto (%d): ", i + 1);
            c_Productos[i] = input.nextLine(); // LLENANDO VECTOR DE NOMBRE O CODIGO DE PRODUCTOS
            System.out.printf("\nDigite el valor del producto (%d): ", i + 1);
            v_Venta[i] = input.nextDouble(); // LLENANDO VECTOR DE VALOR DE VENTAS
            System.out.printf("\nDigite la cantidad de unidades vendidas del producto (%d): ", i + 1);
            u_Vendidas[i] = input.nextInt(); // LLENANDO VECTOR DE CANTIDADES VENDIDAS
            System.out.println("\033\143"); // LIMPIAR PANTALLA
        }

        // CALCULANDO TOTAL DE PRODUCTOS VENDIDOS EN EL DIA

        for (int i = 0; i < n; i++) {
            t_ProductosVendidos = u_Vendidas[i] + t_ProductosVendidos;
        }
        System.out.printf("\nel dia de hoy se vendieron en total (%d) productos ", t_ProductosVendidos);

        // CALCULANDO TOTAL DE INGRESOS POR VENTAS EN EL DIA

        for (int i = 0; i < n; i++) {
            t_IngresosVentas = (u_Vendidas[i] * v_Venta[i]) + t_IngresosVentas;
        }
        System.out.printf("\nel dia de hoy, el total de ingresos por venta fue de: (%.2f) $ ", t_IngresosVentas);

        // CALCULANDO EL PRODUCTO MAS VENDIDO EN EL DIA

        for (int i = 0; i < n; i++) {
            if (mayor < u_Vendidas[i]) {
                mayor = u_Vendidas[i];
                indice1 = i;
            }
        }
        System.out.printf("\nel dia de hoy, el producto mas vendido fue: (%d) $ ", c_Productos[indice1]);

        // CALCULANDO EL PRODUCTO MAS COSTOSO VENDIDO EN EL DIA
        for (int i = 0; i < n; i++) {
            if (p_MasCostoso < v_Venta[i]) {
                p_MasCostoso = v_Venta[i];
                indice2 = i;
            }
        }
        System.out.printf("\nel dia de hoy, el producto mas costoso vendido fue: (%d) $ ", c_Productos[indice2]);
        /*
         * // IMPRESION PARA PRUEBA System.out.println("\033\143"); // LIMPIAR PANTALLA
         * System.out.print("Valores del vector Codigo de productos: "); for(int
         * i=0;i<c_Productos.length;i++){ // 2.DO BUCLE PARA IMPRIMIR SEGUN LA LONGITUD
         * DEL VECTOR System.out.println(c_Productos[i]); // IMPRIMIENDO ELEMENTOS DEL
         * VECTOR CODIGO DE PRODUCTOS }
         */
    }
}