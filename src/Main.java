import com.backend.clase.dto.Cancion;
import com.backend.clase.factory.CancionFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final String canciones[]= {"plantasia", "lingus", "el chupa chihci", "superman tenido"};
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Cancion cancion = CancionFactory.almacenarCancion(cancionAleatoria());
            cancion.setArtista("");
            cancion.setGenero("");
            cancion.almacenar();
        }
    }

    private static String cancionAleatoria(){
        return canciones[(int)(Math.random()*canciones.length)];
    }
}