package Menu;
import Entidades.EtapasEnum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Vino;
import Menu.ConsultarEtapaActual;

import static Menu.ConsultarEtapaActual.consultarEtapaActual;

public class CambiarEtapa {
    //Contructor
    public static void cambiarEtapa(){}

    /**
     * Método para actualizar la etapa de elaboración de la uva
     * @version 1.0, 8/9/2023
     * @author Paulina Suden
     * */

    public static void cambiarDeEtapa(ArrayList<Vino> listaVinos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el vino que quiere cambiarle la etapa");
        int cont = 1;
        for (Vino vino: listaVinos ){
            System.out.println(cont +") " +vino.uva.getNombreUva());
            cont++;
        }

        boolean vinoElegido = false;
        int eleccion=0;
        while (!vinoElegido) {
            try {
                eleccion = entrada.nextInt();
                if (eleccion >= 1 && eleccion <= listaVinos.size()) {
                    vinoElegido = true;
                } else {
                    System.out.println("Debe ingresar un número entre 1 y "+listaVinos.size());
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                entrada.nextLine(); // "Limpiar" el búfer de entrada
            }
        }
        eleccion--;
        Vino vino = listaVinos.get(eleccion);

        if (vino.getEtapa() == 10) {
            System.out.println("No hay más etapas posibles, ya terminó la elaboración!");
        } else {
            System.out.println("¿Cuál es la nueva etapa actual? Elija la opción correspondiente:");
            int opcion = 1;
            for (EtapasEnum etapa : EtapasEnum.values()) {
                System.out.println(opcion + ") " + etapa);
                opcion += 1;
            }
            boolean elegida = false;

            while (!elegida) {
                int newEtapa;
                try {
                    newEtapa = entrada.nextInt();
                    if (newEtapa > vino.getEtapa() && newEtapa <= 10) {
                        elegida = true;
                        vino.setEtapa(newEtapa);
                        ConsultarEtapaActual consultaEtapa = new ConsultarEtapaActual();
                        System.out.println("Excelente!");
                        ConsultarEtapaActual.consultarEtapa(listaVinos);
                    } else {
                        System.out.println("Por favor, ingrese una etapa válida (opción mayor a " +vino.getEtapa() +" y hasta 10)");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    entrada.nextLine();
                }
            }
        }
    }
    //Consultar nombre etapa:
    // /////EtapasEnum etapa = EtapasEnum.values()[2];
}
