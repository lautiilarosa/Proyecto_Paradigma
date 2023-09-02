package Interfaces;
import Entidades.Bodega;

public interface Botellas {
    public default void actualizarBotellas(Bodega cantBotellas, int nuevaCantBotellas){
        cantBotellas.setCantBotellas(nuevaCantBotellas);
    }
}
