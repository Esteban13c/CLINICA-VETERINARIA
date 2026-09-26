public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private String nombrePropietario;

    public Animal(String nombre, int edad, double peso, String nombrePropietario) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.nombrePropietario = nombrePropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Propietario: " + nombrePropietario);
    }
}