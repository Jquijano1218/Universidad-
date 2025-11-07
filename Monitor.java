class Monitor implements Observador {
    private String nombre;

    public Monitor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("🧭 Monitor " + nombre + " preparará materiales para: " + mensaje);
    }
}