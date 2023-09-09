package Menu;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

import Entidades.EtapasEnum;
import Entidades.Uvas.*;
import Entidades.Bodega;
import Entidades.Vino;
import Entidades.Uvas.TiposUva;
import Servicios.BodegaServicios;

/**
 * Clase IngresarUva en el cual el usuario ingresa y almacenamos un objeto uva en el objeto vino
 */

public class IngresarUva {

    public static void ingresarUva() {
        Uva nuevaUva = null;
        Vino nuevoVino;
        Scanner scan = new Scanner(System.in);

        System.out.println("A continuación elija la opción entre 1 y 15 de la uva que desea ingresar:");
        TiposUva.imprimirTipoUva();
        
        int opcion = 1;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                opcion = scan.nextInt();
                entradaValida = opcion >= 1 && opcion <= 15;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entre 1 y 15.");
                scan.nextLine(); // "Limpiar" el búfer de entrada
            }
        }
        elegirUva(nuevaUva,opcion);
        System.out.println("");
        System.out.println("Ahora ingrese la etapa entre 1 y 10 en la cual quiere que este su uva: ");
        EtapasEnum.imprimirEtapas();

        entradaValida = false;
        while (!entradaValida){
            try{
                opcion = scan.nextInt();
                entradaValida = opcion >= 1 && opcion <= 10;

            }catch (InputMismatchException e){
                System.out.println("Error,ingrese un número entre 1 y 10.");
                scan.nextLine();
            }
        }

        nuevoVino = new Vino(0,nuevaUva,opcion);
        Bodega.agregarUva(nuevaUva);
        Bodega.agregarVino(nuevoVino);

    }

    /**
     * Método elegirUva en donde creamos el objeto de la uva elegida por el usuario
     * @param opcion es la opción que eligió previamente el usuario
     * @return retorna finalmente el objeto de la clase correspodiente a esa uva
     */
    public static Uva elegirUva(Uva nuevaUva, int opcion){
        switch (opcion){
            case 1:
                nuevaUva = new CabernetSauvignon();
                break;
            case 2:
                nuevaUva = new Merlot();
                break;
            case 3:
                nuevaUva = new Tempranillo();
                break;
            case 4:
                nuevaUva = new Granacha();
                break;
            case 5:
                nuevaUva = new PinotNoir();
                break;
            case 6:
                nuevaUva = new Bonarda();
                break;
            case 7:
                nuevaUva = new PinotGris();
                break;
            case 8:
                nuevaUva = new Chardonnay();
                break;
            case 9:
                nuevaUva = new SauvignonBlanc();
                break;
            case 10:
                nuevaUva = new Verdejo();
                break;
            case 11:
                nuevaUva = new Albariño();
                break;
            case 12:
                nuevaUva = new Godello();
                break;
            case 13:
                nuevaUva = new Malbec();
                break;
            case 14:
                nuevaUva = new CabernetFranc();
                break;
            case 15:
                nuevaUva = new MoscatelAlejandria();
                break;
        }
        return nuevaUva;
    }

}
