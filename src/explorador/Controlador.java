package explorador;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mauro
 */
class Controlador {

    private Boolean changed = false;
    private Explorer frame;
    private Integer row;

    public Controlador(Explorer frame) {
        this.frame = frame;
    }

    public void setChanged() {
        changed = true;
        frame.setEnabledMostrar(true);
    }

    public void mostrarImagen() {
        JLabel label = frame.getJlDisplay();
        String pathImagen = "src\\Imagenes\\"+(String) frame.getJlLista().getModel().getElementAt(row);
        label.setIcon(new ImageIcon(pathImagen)); 
    }

    /**
     * @return the row
     */
    public Integer getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(Integer row) {
        this.row = row;
    }
}
