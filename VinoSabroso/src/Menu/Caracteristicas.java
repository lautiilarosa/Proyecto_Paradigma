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
        tipo++;
        switch (tipo){ //Indicar el tipo de uva que eligió el usuario y mostrar las características de esa misma
            case 1: Uva cabernetSauvignon = new CabernetSauvignon();
                System.out.println("Cabernet Sauvignon:");
                cabernetSauvignon.imprimirInformacion();
                break;
            case 2: Uva merlot = new Merlot();
                System.out.println("Merlot:");
                merlot.imprimirInformacion();
                break;
            case 3: Uva tempranillo = new Tempranillo();
                System.out.println("Tempranillo:");
                tempranillo.imprimirInformacion();
                break;
            case 4: Uva granacha = new Granacha();
                System.out.println("Granacha:");
                granacha.imprimirInformacion();
                break;
            case 5: Uva pinotNoir = new PinotNoir();
                System.out.println("Pinot Noir");
                pinotNoir.imprimirInformacion();
                break;
            case 6: Uva bonarda = new Bonarda();
                System.out.println("Bonarda");
                bonarda.imprimirInformacion();
                break;
            case 7: Uva pinotGris = new PinotGris();
                System.out.println("Pinot Gris:");
                pinotGris.imprimirInformacion();
                break;
            case 8: Uva chardonnay = new Chardonnay();
                System.out.println("Chardonnay:");
                chardonnay.imprimirInformacion();
                break;
            case 9: Uva sauvignonBlanc = new SauvignonBlanc();
                System.out.println("Sauvignon Blanc:");
                sauvignonBlanc.imprimirInformacion();
                break;
            case 10: Uva verdejo = new Verdejo();
                System.out.println("Verdejo:");
                verdejo.imprimirInformacion();
                break;
            case 11: Uva albariño = new Albariño();
                System.out.println("Albariño:");
                albariño.imprimirInformacion();
                break;
            case 12: Uva godello = new Godello();
                System.out.println("Godello:");
                godello.imprimirInformacion();
                break;
            case 13: Uva malbec = new Malbec();
                System.out.println("Malbec:");
                malbec.imprimirInformacion();
                break;
            case 14: Uva cabernetFranc = new CabernetFranc();
                System.out.println("Cabernet Franc:");
                cabernetFranc.imprimirInformacion();
                break;
            case 15: Uva moscatelAlejandria = new MoscatelAlejandria();
                System.out.println("Moscatel Alejandria:");
                moscatelAlejandria.imprimirInformacion();
                break;
        }
    }
}
