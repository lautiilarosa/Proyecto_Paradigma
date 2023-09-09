package Menu;
import Entidades.Uvas.Uva;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public Menu(){
    }
    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        boolean exit = false; boolean flagMenu = false;int eleccion =0;
        while (!exit) {
            do{
                System.out.println(" ");
                System.out.println("1 - Ingresar un tipo de uva");
                System.out.println("2 - Consultar estado de los vinos");
                System.out.println("3 - Cambiar de etapa");
                System.out.println("4 - Ver características de un vino");
                System.out.println("5 - Salir");
                try {
                    eleccion = scan.nextInt();
                    if (eleccion >= 1 && eleccion <= 5) {
                        flagMenu = true;
                    } else {
                        flagMenu = false;
                        System.out.println("Debe ingresar un número entre 1 y 5.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scan.nextLine(); // "Limpiar" el búfer de entrada
                }
            }while(!flagMenu);

            switch (eleccion) {
                case 1:
                    IngresarUva.ingresarUva();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    ConsultarEstados.consultarEstadosVinos();
                    break;
                case 3:
                    CambiarEtapa.cambiarEtapa();
                    break;
                case 4:
                    Caracteristicas.mostrarCaracteristicas();
                    try {
                        Thread.sleep(5000); // Pausa durante 5 segundos para que se vea mas "ordenado"
                    } catch (InterruptedException e) {
                        // Manejar cualquier excepción
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar Vino Sabroso. ¡¡Vuelva Pronto!!");
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida, por favor");
            }
        }
    }


}
