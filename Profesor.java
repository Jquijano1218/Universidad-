import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String nombre;
    private List<Observador> observadores;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.observadores = new ArrayList<>();
    }

     public void agregarObservador(Observador o) {
        observadores.add(o);
        System.out.println(">> Nuevo observador agregado al profesor " + nombre);
    }

    public void eliminarObservador(Observador o) {
        observadores.remove(o);
        System.out.println(">> Observador eliminado del profesor " + nombre);
    }

    public void notificar(String mensaje) {
        System.out.println("\n[PROFESOR " + nombre + "]: " + mensaje);
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }
}