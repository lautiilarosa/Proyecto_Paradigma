package Servicios;
import Entidades.Vino;
public class VinoServicios {
    public boolean terminado(Vino contadorEstado) {
        return contadorEstado.getContadorEstado() == 9;
    }
    public void actualizarEstado(Vino estado, String newEstado) {
        estado.setEstado(newEstado);
    }
    public void mostrarEstado(Vino estado) {
        System.out.println("Estado actual: " +estado.getEstado());
    }
}