package tiendalibros;

public class Maintiendalibros {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 15.99);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 12.50);

        // Utilización de los métodos de las interfaces
        libro1.mostrarInformacion();
        System.out.println("Precio del libro 1: $" + libro1.obtenerPrecio());

        libro2.mostrarInformacion();
        System.out.println("Precio del libro 2: $" + libro2.obtenerPrecio());
    }
}
