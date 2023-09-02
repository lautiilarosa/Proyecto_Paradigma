package Interfaces;
import Entidades.Bodega;

public interface Camiones {
    public default void actualizarCamiones(Bodega cantCamiones,int nuevaCantCamiones){
        cantCamiones.setCantCamiones(nuevaCantCamiones);
    }
}
