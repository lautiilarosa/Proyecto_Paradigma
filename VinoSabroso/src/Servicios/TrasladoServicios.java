package Servicios;
import Entidades.Traslado;
public class TrasladoServicios {
    public void actualizarCamiones(Bodega cantCamiones,int nuevaCantCamiones){
        cantCamiones.setCantCamiones(nuevaCantCamiones);
    }
}
