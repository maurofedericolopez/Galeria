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

    public ListaListener(JList lista, Controlador controlador) {
        this.lista = lista;
        this.controlador = controlador;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(rowSelected == -1) {
            controlador.setChanged();
        }
        if ( this.getRowSelected() != lista.getSelectedIndex() && lista.getSelectedIndex()>=0) { 
            System.out.println(lista.getSelectedIndex());
            this.rowSelected = lista.getSelectedIndex();
            controlador.setRow(rowSelected);
        }
    }

    /**
     * @return the rowSelected
     */
    public int getRowSelected() {
        return rowSelected;
    }
}
