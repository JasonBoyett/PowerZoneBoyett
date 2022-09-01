import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class OpenerGUI extends JFrame{
    String customerID;
    int timeBooked;
    BookButton bookButton;

    public OpenerGUI(){
        //bookButton = new BookButton(this.customerID,this);
        new ImageIcon background = createImage("PowerZoneOpenerScreen.png"); 

        this.setVisible(true);
        this.setSize(1280,720);
        this.setContentPane();
        
    }
}