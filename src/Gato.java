public class Gato extends Animal {
    private boolean esInterior;

    public Gato(String nombre, int edad, double peso, String nombrePropietario, boolean esInterior) {
        super(nombre, edad, peso, nombrePropietario);
        this.esInterior = esInterior;
    }

    public boolean isEsInterior() {
        return esInterior;
    }

    public double calcularAlimentoDiario() {
        return getPeso() * 15;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("========== GATO ==========\n");
        super.mostrarInformacion();
        System.out.println("Tipo: " + (esInterior ? "Interior" : "Exterior"));
        System.out.println("\nAlimento recomendado: " + (int) calcularAlimentoDiario() + " gramos\n");
    }
}