package Menu;
import Entidades.EtapasEnum;
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Vino;

public class CambiarEtapa {
    //Contructor
    public static void cambiarEtapa(){}

    /**
     * Método para actualizar la etapa de elaboración de la uva
     * @version 1.0, 8/9/2023
     * @author Paulina Suden
     * */

    public void cambiarDeEtapa(Vino vino) {
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
            Scanner entrada = new Scanner(System.in);
            while (!elegida) {
                int newEtapa;
                try {
                    newEtapa = entrada.nextInt();
                    if (newEtapa > vino.getEtapa() && newEtapa <= 10) {
                        elegida = true;
                        vino.setEtapa(newEtapa);
                        ConsultarEtapaActual consultaEtapa = new ConsultarEtapaActual();
                        System.out.println("Excelente!");
                        consultaEtapa.consultarEtapa(vino);
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
