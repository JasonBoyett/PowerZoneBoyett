import javax.swing.JButton;
import javax.swing.JFrame;

public class ReturnButton extends JButton{
    JFrame frame;
    this.text = "Re-Book";
    this.actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            OpenerGUI window = new OpenerGUI();
            window.setVisible(true);
            this.frame.dispose();
        }
    }

    public ReturnButton(JFrame frame) {
        super();
        this.frame = frame;
    }

}
