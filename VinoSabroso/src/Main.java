import Entidades.* ;
import java.util.ArrayList;
import java.util.Objects;
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
        while (exit == false) {
            System.out.println("Bienvenido a Vino Sabroso!");
            System.out.println(" ");
            System.out.println("1 - Ingresar un tipo de uva");
            System.out.println("2 - Consultar estado de los vinos");
            System.out.println("3 - Retirar vinos terminados");
            System.out.println("4 - Ver Características de un vino");
            System.out.println("5 - Salir");
            int eleccion = scan.nextInt();
            switch (eleccion) {
                case 1:


                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida, por favor");
            }
        }

    }

    public static ArrayList<String> calcularUvasDisponibles(int mes) {
        ArrayList<String> uvasDisponibles = new ArrayList<>();
        //ArrayList<String> uvasNoDisponibles = new ArrayList<>();
        if (mes == 1 | mes == 6 | mes == 7 | mes == 11 | mes == 12) {
            uvasDisponibles.add("No hay uvas disponibles para cosechar este mes");
        } else if (mes == 2) {
            uvasDisponibles.add("Cabernet Sauvignon"); uvasDisponibles.add("Malbec");
        } else if (mes == 3) {
            uvasDisponibles.add("Cabernet Sauvignon"); uvasDisponibles.add("Pinot Gris"); uvasDisponibles.add("Sauvignon Blanc"); uvasDisponibles.add("Malbec"); uvasDisponibles.add("Merlot");
        } else if (mes == 4) {
            uvasDisponibles.add("Tempranillo"); uvasDisponibles.add("Merlot");
        } else if (mes == 5) {
            uvasDisponibles.add("Tempranillo");
        } else if (mes == 8) {
            uvasDisponibles.add("Moscatel de Alejandría"); uvasDisponibles.add("Pinot Noir");uvasDisponibles.add("Chardonnay"); uvasDisponibles.add("Godello");
        } else if (mes == 9) {
            uvasDisponibles.add("Granacha"); uvasDisponibles.add("Pinot Noir"); uvasDisponibles.add("Verdejo"); uvasDisponibles.add("Albariño"); uvasDisponibles.add("Moscatel de Alejandría"); uvasDisponibles.add("Godello"); uvasDisponibles.add("Cabernet Franc");
        } else if (mes == 10) {
            uvasDisponibles.add("Granacha"); uvasDisponibles.add("Albariño"); uvasDisponibles.add("Cabernet Franc");
        }
        return uvasDisponibles;

        // para consutltar uvas disponibles:
        //ArrayList<String> uvasDisponibles = Main.calcularUvasDisponibles(mes);
        //System.out.println(uvasDisponibles);
    }
}

