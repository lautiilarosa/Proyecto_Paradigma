package Interfaces;

import Entidades.Vino;

import java.util.ArrayList;

/**
 * Clase Interface IConsultarEtapaActual
 */
public interface IConsultarEtapaActual {
    default void consultarEtapa(ArrayList<Vino> listaVinos,Vino vino){
    }
}
