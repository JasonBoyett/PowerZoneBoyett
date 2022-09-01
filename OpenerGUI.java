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
    String customerID = "#####";
    int timeBooked;
    Image background;

    public OpenerGUI() {
        BookButton bookButton = new BookButton(this.customerID, this);
        final ImageIcon backgroundIcon = new ImageIcon("PowerZoneOpenerScreen.png");
        Image backgroundImage = backgroundIcon.getImage();
        JLabel myJLabel = new JLabel(backgroundIcon);
        myJLabel.setVisible(true);
        myJLabel.setIcon(backgroundIcon);
        this.add(bookButton);
        bookButton.setBounds(515, 0, 300, 100);
        this.add(myJLabel);
        this.setVisible(true);
        this.setSize(1280, 720);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}