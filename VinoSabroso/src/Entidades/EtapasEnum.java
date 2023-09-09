package Entidades;

/**
 * Enumeracion EtapasNum donde cada valor representa las etapas de elaboración del vino
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public enum EtapasEnum {
    MaduracionUva,
    Cosecha,
    Traslado,
    Despalillado,
    TrasladoDepósito,
    PrimeraFermentación,
    SegundaFermentación,
    Limpieza,
    Crianza,
    Embotellamiento;

    public static void imprimirEtapas(){
        int cont = 1;
        for (EtapasEnum etapa : EtapasEnum.values()){
            System.out.println(cont+": "+etapa);
            cont += 1;
        }
        System.out.println("");
    }
}
