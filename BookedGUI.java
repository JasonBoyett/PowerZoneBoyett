import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookedGUI extends JDialog {
    ImageIcon background = new ImageIcon("BookingPopUp.png");
    JLabel myJLabel = new JLabel(background);
    ReturnButton myReturnButton = new ReturnButton(this);
    
    public BookedGUI() {
        this.setSize(500, 600);
        this.add(myJLabel);
        this.add(myReturnButton);
        myReturnButton.setBounds(100,100,100,300);

    }

}
