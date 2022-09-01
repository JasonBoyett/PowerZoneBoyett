import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BookButton extends JButton {
    JFrame frame;
    static Icon icon = new ImageIcon("BookButton.png");

    public void book(Customer customer, JFrame frame) {
        if (customer.validateCustomerID(customer.getCustomerID()) == true) {
            BookedGUI booked = new BookedGUI();
            booked.setVisible(true);
            frame.setVisible(false);
        }

        else if (customer.validateCustomerID(customer.getCustomerID()) == false) {
            ErrorGUI error = new ErrorGUI();
            error.setVisible(true);
            frame.setVisible(false);
        }
    }

    public BookButton(String CustomerID, JFrame jFrame) {

        super(icon);
        Customer customer = new Customer(CustomerID);
        this.frame = jFrame;
        this.addActionListener(e -> book(customer, frame));
        this.setSize(300, 200);
    }
}
