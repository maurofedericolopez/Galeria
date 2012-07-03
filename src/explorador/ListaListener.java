package explorador;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Mauro
 */
public class ListaListener implements ListSelectionListener {

    private JList lista;
    private int rowSelected = -1;
    private Controlador controlador;

    public ListaListener(JList lista) {
        this.lista = lista;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if ( this.getRowSelected() != lista.getSelectedIndex() && lista.getSelectedIndex()>=0) {
            this.rowSelected = lista.getSelectedIndex();
        }
    }

    /**
     * @return the rowSelected
     */
    public int getRowSelected() {
        return rowSelected;
    }
}
