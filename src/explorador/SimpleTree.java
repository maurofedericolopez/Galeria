package explorador;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author matiasgel
 */
public final class SimpleTree extends JPanel implements TreeSelectionListener {

    JTree tree;
    DefaultMutableTreeNode root;

    public SimpleTree() {
        root = new DefaultMutableTreeNode("root", true);
        getList(root, new File("src\\Imagenes"));
        setLayout(new BorderLayout());
        tree = new JTree(root);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.addTreeSelectionListener(this);
        tree.setRootVisible(false);
        add(new JScrollPane((JTree)tree),"Center");
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(200, 120);
    }

    public void getList(DefaultMutableTreeNode node, File f) {
        if(!f.isDirectory()) {
            // We keep only JAVA source file for display in this HowTo
            if (f.getName().endsWith("java")) {
                System.out.println("FILE  -  " + f.getName());
                DefaultMutableTreeNode child = new DefaultMutableTreeNode(f);
                node.add(child);
            }
        }
        else {
            System.out.println("DIRECTORY  -  " + f.getName());
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(f);
            node.add(child);
            File fList[] = f.listFiles();
            for(int i = 0; i  < fList.length; i++)
                getList(child, fList[i]);
        }
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        
    }
}
