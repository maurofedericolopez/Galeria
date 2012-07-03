package explorador;

import javax.swing.AbstractListModel;

/**
 *
 * @author Mauro
 */
public class ListaModel extends AbstractListModel {

    private String[] path;
    private Directorio dir;

    public ListaModel() {
        dir = new Directorio();
        path = dir.getList();
    }

    @Override
    public int getSize() {
        return path.length;
    }

    @Override
    public Object getElementAt(int index) {
        return path[index];
    }

    /**
     * @return the dir
     */
    public Directorio getDir() {
        return dir;
    }
}
