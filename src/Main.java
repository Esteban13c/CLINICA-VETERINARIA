import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        listaAnimales.add(new Perro("Max", 5, 12, "Carlos Pérez", "Labrador"));
        listaAnimales.add(new Perro("Rocky", 3, 20, "Andrés Torres", "Pastor Alemán"));

        listaAnimales.add(new Gato("Luna", 3, 4, "Laura Gómez", true));
        listaAnimales.add(new Gato("Milo", 2, 5, "Sofía Rodríguez", false));

        for (Animal animal : listaAnimales) {
            animal.mostrarInformacion();
        }
    }
}