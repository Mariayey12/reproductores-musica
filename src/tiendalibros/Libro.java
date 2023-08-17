package tiendalibros;

interface Mostrable {
    void mostrarInformacion();
}

interface Vendible {
    double obtenerPrecio();
}

class Libro implements Mostrable, Vendible {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        if (titulo == null || titulo.isEmpty() || autor == null || autor.isEmpty() || precio < 0) {
            throw new IllegalArgumentException("Datos del libro inválidos");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + " - Autor: " + autor + " - Precio: " + precio);
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }
}