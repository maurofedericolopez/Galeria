package explorador;

import java.io.File;

/**
 *
 * @author Mauro
 */
public class Directorio {

    public static String[] getList() {
        File directorio = new File("src\\Imagenes");
        if(directorio.exists()) {
            String[] s = directorio.list();
            return s;
        }
        else
            return null;
    }
}
