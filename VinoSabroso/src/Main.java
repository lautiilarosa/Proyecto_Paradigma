import Entidades.* ;
import java.util.Scanner;

public class Main {

    public static void consultarEstadosVinos(){

    }
    public static void retirarVinos(){

    }
    public static void mostrarCaracteristicas(){
        Scanner scan = new Scanner(System.in);
        int tipo=0;
        do {
            System.out.println("Elija el tipo de vino el cual desea ver sus características");
            TipoUva.mostrarUvas();
            tipo = scan.nextInt();
        }while(tipo<0 || tipo>15);
        tipo--;
        TipoUva[] tiposUvas = TipoUva.values();
        System.out.println(tiposUvas[tipo]+":");
        System.out.println("Sabor: "+tiposUvas[tipo].getSabor);
        System.out.println("Aroma: "+tiposUvas[tipo].getAromaIntensidad);
        System.out.println("Cuerpo: "+tiposUvas[tipo].getCuerpo);
        System.out.println("Apariencia visual: "+tiposUvas[tipo].getAparienciaVisual);
        System.out.println("Lugar de cosecha: "+tiposUvas[tipo].getLugarCosecha);
        System.out.println("Epoca de cosecha: "+tiposUvas[tipo].getEpocaCosecha);
        System.out.println("Grado de alcohol: "+tiposUvas[tipo].getGradoAlcohol);
        System.out.println("Maridaje: "+tiposUvas[tipo].getMaridaje);
    }


    public static void main(String[] args) {

        //Bodega vinoSabroso = new Bodega();
        Scanner scan = new Scanner(System.in);
        int mes=0;
        do {
            System.out.println("Ingrese el mes en el que se encuentra (con números del 1 al 12)");
            mes = scan.nextInt();
        }while (mes<1 || mes>12);

        // ---------- Menú ----------
        boolean exit = false;
        while (exit==false){
            System.out.println("Bienvenido a Vino Sabroso!");
            System.out.println(" ");
            System.out.println("1 - Ingresar un tipo de uva");
            System.out.println("2 - Consultar estado de los vinos");
            System.out.println("3 - Retirar vinos terminados");
            System.out.println("4 - Ver características de un vino");
            System.out.println("5 - Salir");
            int eleccion = scan.nextInt();
            switch (eleccion) {
                case 1:
                case 2:
                    consultarEstadosVinos();
                case 3:
                    retirarVinos();
                case 4:
                    boolean flag = true;
                    while (flag){
                        mostrarCaracteristicas();
                        System.out.println("¿Desea ver las características de otro vino? (SI/NO)");
                        String seguir = scan.nextLine();
                        if (seguir.toUpperCase()=="NO" || seguir.toUpperCase()=="N"){
                            flag=false;}
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida, por favor");
            }
        }
    }
}

