import javax.swing.JButton;
import javax.swing.JFrame;

public class ReturnButton extends JButton{
    
    

    public void press (JFrame frame) {
        OpenerGUI window = new OpenerGUI();
        window.setVisible(true);
        frame.setVisible(false);;
        
    }

    

    public ReturnButton(JFrame frame) {
        super();
        this.addActionListener(e -> press(frame));
        this.setText("re-book");
    }

}
