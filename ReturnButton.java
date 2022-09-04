import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class ReturnButton extends JButton {

    static Icon icon = new ImageIcon("RebookButton.png");

    public void press(JDialog frame) {
        OpenerGUI window = new OpenerGUI();
        window.setVisible(true);
        frame.setVisible(false);

    }

    public ReturnButton(JDialog frame) {
        super(icon);
        this.addActionListener(e -> press(frame));

    }

}
