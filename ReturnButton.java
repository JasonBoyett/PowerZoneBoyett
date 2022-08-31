import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

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
