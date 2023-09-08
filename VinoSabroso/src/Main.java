import Entidades.Uvas.Uva;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import Menu.Menu;


public class Main {

    public static void main(String[] args) {
        //Bodega vinoSabroso = new Bodega();
        Scanner scan = new Scanner(System.in);
        System.out.println("¡Bienvenido a Vino Sabroso!"+
                "\t  \n");
        System.out.println("Ingrese el mes en el que se encuentra (con números del 1 al 12)");
        int mes=0;boolean flagMes = false;
        do{
            try {
                mes = scan.nextInt();
                if (mes >= 1 && mes <= 12) {
                    flagMes = true;
                } else {
                    flagMes = false;
                    System.out.println("El mes debe estar en el rango de 1 a 12.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scan.nextLine(); // "Limpiar" el búfer de entrada para evitar un bucle infinito.
            }
        }while(!flagMes);
        // ---------- Menú ----------
        Menu menu = new Menu();
        menu.mostrarMenu();
    }




}