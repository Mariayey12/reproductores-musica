package ReproducM;


// Clase para el reproductor de música en streaming
public class ReproductorStreaming implements ReproductorMusica {
    private String nombre;
    private boolean reproduciendo;

    public ReproductorStreaming(String nombre) {
        this.nombre = nombre;
        this.reproduciendo = false;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void reproducir() {
        if (!reproduciendo) {
            System.out.println("Reproduciendo música en streaming");
            reproduciendo = true;
        } else {
            System.out.println("La música ya se está reproduciendo");
        }
    }

    @Override
    public void pausar() {
        if (reproduciendo) {
            System.out.println("Pausando música en streaming");
            reproduciendo = false;
        } else {
            System.out.println("No hay música reproduciéndose para pausar");
        }
    }

    @Override
    public void detener() {
        if (reproduciendo) {
            System.out.println("Deteniendo música en streaming");
            reproduciendo = false;
        } else {
            System.out.println("No hay música reproduciéndose para detener");
        }
    }
}

