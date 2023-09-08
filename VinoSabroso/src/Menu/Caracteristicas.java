package Menu;

import Entidades.Uvas.Albariño;
import Entidades.Uvas.Uva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caracteristicas {
    public  void mostrarCaracteristicas(){
        Scanner scan = new Scanner(System.in);
        int tipo=0;boolean flagTipoUva = false;
        do{
            //mostrar enum uvas
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
    }
}
