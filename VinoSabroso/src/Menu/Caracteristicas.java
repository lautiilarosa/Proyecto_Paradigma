package Menu;

import Entidades.Uvas.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Caracteristicas para indicar las caracteristicas del tipo de uva que elija el usuario
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */
public class Caracteristicas {
    /**
     * Método sin retorno que muestra las características de determinado tipo de uva
     */
    public static void mostrarCaracteristicas(){
        Scanner scan = new Scanner(System.in);
        int tipo=0;boolean flagTipoUva = false;
        do{
            TiposUva uvas[] = TiposUva.values();
            for (int i=0;i<=14;i++){ //Bucle que muestra todas las uvas en forma de lista ordenada
                System.out.println((i+1)+": "+uvas[i]);
            }
            try {
                tipo = scan.nextInt();
                if (tipo >= 1 && tipo <= 15) {
                    flagTipoUva = true;
                } else {
                    flagTipoUva = false;
                    System.out.println("Debe ingresar un número entre 1 y 15.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scan.nextLine(); // "Limpiar" el búfer de entrada
            }
        }while(!flagTipoUva);
        switch (tipo){ //Indicar el tipo de uva que eligió el usuario y mostrar las características de esa misma
            case 1: Uva cabernetSauvignon = new CabernetSauvignon();
                cabernetSauvignon.imprimirInformacion();
                break;
            case 2: Uva merlot = new Merlot();
                merlot.imprimirInformacion();
                break;
            case 3: Uva tempranillo = new Tempranillo();
                tempranillo.imprimirInformacion();
                break;
            case 4: Uva granacha = new Granacha();
                granacha.imprimirInformacion();
                break;
            case 5: Uva pinotNoir = new PinotNoir();
                pinotNoir.imprimirInformacion();
                break;
            case 6: Uva bonarda = new Bonarda();
                bonarda.imprimirInformacion();
                break;
            case 7: Uva pinotGris = new PinotGris();
                pinotGris.imprimirInformacion();
                break;
            case 8: Uva chardonnay = new Chardonnay();
                chardonnay.imprimirInformacion();
                break;
            case 9: Uva sauvignonBlanc = new SauvignonBlanc();
                sauvignonBlanc.imprimirInformacion();
                break;
            case 10: Uva verdejo = new Verdejo();
                verdejo.imprimirInformacion();
                break;
            case 11: Uva albariño = new Albariño();
                albariño.imprimirInformacion();
                break;
            case 12: Uva godello = new Godello();
                godello.imprimirInformacion();
                break;
            case 13: Uva malbec = new Malbec();
                malbec.imprimirInformacion();
                break;
            case 14: Uva cabernetFranc = new CabernetFranc();
                cabernetFranc.imprimirInformacion();
                break;
            case 15: Uva moscatelAlejandria = new MoscatelAlejandria();
                moscatelAlejandria.imprimirInformacion();
                break;
        }
    }
}
