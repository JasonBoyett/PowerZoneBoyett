import java.io.*;
import java.awt.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Toolkit;

public class OpenerGUI extends JFrame {
    String customerID;
    int timeBooked;
    BookButton bookButton;
    Image background;

    public OpenerGUI() {
        bookButton = new BookButton(this.customerID, this);
        final ImageIcon backgroundIcon = new ImageIcon("PowerZoneOpenerScreen.png");
        Image backgroundImage = backgroundIcon.getImage();
        this.setVisible(true);
        this.setSize(1280, 720);
        this.setIconImage(backgroundImage);

    }
}