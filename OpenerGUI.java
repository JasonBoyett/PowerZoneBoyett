import java.io.*;
import java.util.concurrent.Flow;
import java.awt.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.Toolkit;

public class OpenerGUI extends JFrame {
    String customerID = "#####";
    int timeBooked;
    BookButton bookButton = new BookButton(this.customerID,this);
    final ImageIcon backgroundIcon = new ImageIcon("PowerZoneOpenerScreen.png");
    Image backgroundImage = backgroundIcon.getImage();
    Image background;
    JTextField textField = new JTextField("Here");
    JLabel myJLabel = new JLabel(backgroundIcon);
    File font_file = new File("DS-DIGI.TTF");
    Font digiFont = new Font("Serif", Font.PLAIN, 30);
    Color fontColor = new Color(15,160,157);
    JTextField timeSelect = new JTextField("15");

    private void setTextLocation(){
        this.textField.setBounds(240,620,420,70);
        this.textField.setOpaque(false);
        this.textField.setBorder(null);
        this.textField.setFont(digiFont);
        this.textField.setForeground(fontColor);
    }

    private void setTextLocationTimeSelect(){
        this.timeSelect.setSize(420,70);
        this.timeSelect.setHorizontalAlignment(JTextField.CENTER);
        this.timeSelect.setBounds(485,325,350,70);
        this.timeSelect.setOpaque(false);
        this.timeSelect.setBorder(null);
        this.timeSelect.setFont(digiFont);
        this.timeSelect.setForeground(fontColor);
    }
    


    public OpenerGUI() {
        
        
        //myJLabel.setVisible(true);
        myJLabel.setIcon(backgroundIcon);
        this.setLayout(null);
        this.add(bookButton);
        textField.setFont(digiFont);

        
        this.myJLabel.add(textField);
        
        this.myJLabel.setLayout(null);
        setTextLocation();

        this.myJLabel.add(timeSelect);
        setTextLocationTimeSelect();
        myJLabel.setBounds(0,0,1280,720);
        
        bookButton.setBounds(515, 0, 300, 100);
        this.setVisible(true);
        this.setSize(1280, 720);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
       
        this.add(myJLabel);
        this.timeBooked = Integer.parseInt(timeSelect.getText());
        
        
    }
}