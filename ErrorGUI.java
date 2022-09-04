import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErrorGUI extends JDialog {
   ImageIcon background = new ImageIcon("ErrorPopUp.png");
   JLabel image = new JLabel(background);
   CancelButton cancelButton = new CancelButton(this);
   ReturnButton returnButton = new ReturnButton(this);

   public ErrorGUI() {
      super();
      setResizable(false);
      this.setVisible(false);
      this.add(image);
      this.setContentPane(image);
      this.setSize(500, 600);
      this.add(cancelButton);
      cancelButton.setLocation(100, 100);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);

   }

}
