package Interfaces;
import Entidades.Bodega;

public interface Barriles {
    public default void actualizarBarriles(Bodega cantBarriles,int nuevaCantBarriles){
        cantBarriles.setCantBarriles(nuevaCantBarriles);
    }
}
