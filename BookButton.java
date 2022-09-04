import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BookButton extends JButton {
    private JFrame frame;
    static Icon icon = new ImageIcon("BookButton.png");

    public void book(String customerID, JFrame frame) {

        Customer customer = new Customer(customerID);
        System.out.println(customer.getCustomerID());
        try {
            if (customer.validateCustomerID(customer.getCustomerID()) == true) {
                BookedGUI booked = new BookedGUI();
                booked.setVisible(true);
                frame.setVisible(false);
            }

            else if (customer.validateCustomerID(customer.getCustomerID()) == false) {
                ErrorGUI error = new ErrorGUI();
                error.setVisible(true);
                frame.setVisible(false);
                System.out.println("the bug is here");
            }
        } catch (Exception e) {
            ErrorGUI error = new ErrorGUI();
        }
    }

    public BookButton(Customer Customer, JFrame jFrame, OpenerGUI Opener) {

        super(icon);

        this.frame = jFrame;
        this.addActionListener(e -> book(Opener.textField.getText(), frame));
        this.setSize(300, 200);
    }
}
