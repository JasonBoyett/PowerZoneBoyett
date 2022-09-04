import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class CancelButton extends JButton {
    private JDialog dialog;
    private static ImageIcon icon = new ImageIcon("ExitButton.png");

    private void press() {
        this.dialog.dispose();
        System.exit(0);
    }

    public CancelButton(JDialog dialog) {
        super(icon);
        this.dialog = dialog;
        this.addActionListener(e -> press());
        this.setSize(300, 100);

    }
}
