package explorador;

import java.io.File;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Directorio {

    private static String ruta = "src\\Imagenes";
    private static File directorio = new File(getRuta());

    /**
     * @return the ruta
     */
    public static String getRuta() {
        return ruta;
    }

    public String[] getList() {
        if(directorio.exists()) {
            String[] s = directorio.list();
            return s;
        }
        else
            return null;
    }
}
