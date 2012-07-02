package explorador;

import java.io.File;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ListaJPG extends JPanel
                      implements ListSelectionListener {
    private JList lista;
    private DefaultListModel listModel;
    private static File directorio = new File("src\\Imagenes");

    public ListaJPG() {

        String[] s = getList();
        listModel = new DefaultListModel();
        for (int i = 0;i < s.length;i++)
            listModel.addElement(s[i]);

        //Create the list and put it in a scroll pane.
        lista = new JList(listModel);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.setSelectedIndex(0);
        lista.addListSelectionListener(this);
        lista.setVisibleRowCount(5);
        JScrollPane listScrollPane = new JScrollPane(lista);

        add(listScrollPane);
    }

    public String[] getList() {
        if(directorio.exists()) {
            String[] s = directorio.list();
            return s;
        }
        else
            return null;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
