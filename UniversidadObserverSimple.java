public class UniversidadObserverSimple {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Andrés");

        Observador est1 = new Estudiante("Camila");
        Observador est2 = new Estudiante("Juan");
        Observador monitor = new Monitor("Lucía");
        Observador coord = new Coordinador("Sergio");

        profesor.agregarObservador(est1);
        profesor.agregarObservador(est2);
        profesor.agregarObservador(monitor);
        profesor.agregarObservador(coord);

        profesor.notificar("Habrá examen el lunes a las 8:00 AM");
        profesor.notificar("El proyecto final se entrega el próximo viernes");

        profesor.eliminarObservador(est2);

        profesor.notificar("Reunión de repaso mañana a las 4:00 PM");
    }
}