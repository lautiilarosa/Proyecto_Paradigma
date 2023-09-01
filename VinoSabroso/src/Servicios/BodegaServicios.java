package Servicios;
import Entidades.Bodega;

public class BodegaServicios {
    public void actualizarMes(Bodega mesActual, int nuevoMes) {
        mesActual.setMesActual(nuevoMes);
    }
}