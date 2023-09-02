import Entidades.* ;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TipoUva tipoUva = TipoUva.MERLOT;
        //tipoUva.mostrarUvas();

        //Bodega vinoSabroso = new Bodega();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el mes en el que se encuentra (con números del 1 al 12)");
        int mes = scan.nextInt();
        // ---------- Menu ----------
        boolean exit = false;
        while (exit==false){
            System.out.println("Bienvenido a Vino Sabroso!");
            System.out.println(" ");
            System.out.println("1 - Ingresar un tipo de uva");
            System.out.println("2 - Consultar estado de los vinos");
            System.out.println("3 - Retirar vinos terminados");
            System.out.println("4 - Ver Características de un vino");
            System.out.println("5 - Salir");
            int eleccion = scan.nextInt();
            switch (eleccion){
                case 1:



                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida, por favor");
            }
        }
    }
}

