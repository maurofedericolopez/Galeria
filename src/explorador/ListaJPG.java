package explorador;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ListaJPG extends JList {

    private File imagenes = new File("src\\Imagenes");
    private JTree tree;
    private DefaultMutableTreeNode root;

    public ListaJPG() {
        this.getSelectionModel().setSelectionModel(ListSelectionModel.SINGLE_SELECTION);
    }
}
