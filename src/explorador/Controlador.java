package explorador;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mauro
 */
class Controlador {

    private Explorer frame;

    public Controlador(Explorer frame) {
        this.frame = frame;
    }

    public void mostrarImagen() {
        if(frame.getJlLista().getSelectedIndex() >= 0) {
            JLabel label = frame.getJlDisplay();
            String pathImagen = Directorio.getRuta()+"\\"+(String) frame.getJlLista().getModel().getElementAt(frame.getJlLista().getSelectedIndex());
            label.setIcon(new ImageIcon(pathImagen));
        }
    }
}
