class Coordinador implements Observador {
    private String nombre;

    public Coordinador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("🗂️ Coordinador " + nombre + " registrará el anuncio en el sistema institucional.");
    }
}