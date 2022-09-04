import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class ReturnButton extends JButton{
    
    

    public void press (JDialog frame) {
        OpenerGUI window = new OpenerGUI();
        window.setVisible(true);
        frame.setVisible(false);;
        
    }

    

    public ReturnButton(JDialog frame) {
        super();
        this.addActionListener(e -> press(frame));
    
    }

}
