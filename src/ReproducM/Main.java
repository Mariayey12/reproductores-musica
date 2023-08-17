package ReproducM;

public class Main {
    public static void main(String[] args) {
        ReproductorMusica reproductor1 = new ReproductorStreaming("Spotify");
        ReproductorMusica reproductor2 = new ReproductorLocal("Reproductor local");

        reproductor1.reproducir();
        reproductor1.pausar();
        reproductor1.detener();
        System.out.println("Reproductor utilizado: " + reproductor1.getNombre());

        reproductor2.reproducir();
        reproductor2.detener();
        System.out.println("Reproductor utilizado: " + reproductor2.getNombre());
    }
}






