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
                cabernetSauvignon.imprimirInformacion();
            case 2: Uva merlot = new Merlot();
                merlot.imprimirInformacion();
            case 3: Uva tempranillo = new Tempranillo();
                tempranillo.imprimirInformacion();
            case 4: Uva granacha = new Granacha();
                granacha.imprimirInformacion();
            case 5: Uva pinotNoir = new PinotNoir();
                pinotNoir.imprimirInformacion();
            case 6: Uva bonarda = new Bonarda();
                bonarda.imprimirInformacion();
            case 7: Uva pinotGris = new PinotGris();
                pinotGris.imprimirInformacion();
            case 8: Uva chardonnay = new Chardonnay();
                chardonnay.imprimirInformacion();
            case 9: Uva sauvignonBlanc = new SauvignonBlanc();
                sauvignonBlanc.imprimirInformacion();
            case 10: Uva verdejo = new Verdejo();
                verdejo.imprimirInformacion();
            case 11: Uva albariño = new Albariño();
                albariño.imprimirInformacion();
            case 12: Uva godello = new Godello();
                godello.imprimirInformacion();
            case 13: Uva malbec = new Malbec();
                malbec.imprimirInformacion();
            case 14: Uva cabernetFranc = new CabernetFranc();
                cabernetFranc.imprimirInformacion();
            case 15: Uva moscatelAlejandria = new MoscatelAlejandria();
                moscatelAlejandria.imprimirInformacion();
        }
    }
}
