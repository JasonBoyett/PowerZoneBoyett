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
        myJLabel.setVisible(true);
        myJLabel.add(myReturnButton);
        myReturnButton.setBounds(92, 120, 300, 100);
        this.setLayout(null);
        this.setContentPane(myJLabel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}
