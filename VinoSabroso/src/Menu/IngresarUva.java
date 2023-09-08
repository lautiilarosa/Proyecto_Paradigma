package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Uvas.TiposUva;

/**
 * Clase IngresarUva en el cual el usuario ingresa y almacenamos un objeto uva en el objeto vino
 */

public class IngresarUva {
    public void IngresarUva(){}

    public static int ingresarUva() {
        Scanner scan = new Scanner(System.in);
        System.out.println("A continuación elija la opción de la uva que desea ingresar:");
        //System.out.println("1.\tCabernet Sauvignon: \n" +
                //"2.\tMerlot\n" +
                //"3.\tTempranillo\n" +
                //"4.\tGranacha: \n" +
                //"5.\tPinot Noir\n" +
                //"6.\tBonarda\n" +
                //"7.\tPinot Gris\n" +
                //"8.\tChardonnay\n" +
                //"9.\tSauvignon Blanc\n" +
                //"10.\tVerdejo\n" +
                //"11.\tAlbariño\n" +
                //"12.\tGodello\n" +
                //"13.\tMoscatel\n" +
                //"14.\tCabernet Franc\n" +
                //"15.\tMalbec\n");
        
        int opcion = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                opcion = scan.nextInt();
                if (opcion >= 1 && opcion <= 15) { entradaValida = true;
                } else { entradaValida = false; }

            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entre 1 y 15.");
                scan.nextLine(); // "Limpiar" el búfer de entrada
            }
        }
        return opcion;
    }


}
