public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, double peso, String nombrePropietario, String raza) {
        super(nombre, edad, peso, nombrePropietario);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public double calcularDosisMedicamento() {
        return getPeso() * 2;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("========== PERRO ==========\n");
        super.mostrarInformacion();
        System.out.println("Raza: " + raza);
        System.out.println("\nDosis recomendada: " + (int) calcularDosisMedicamento() + " ml\n");
    }
}