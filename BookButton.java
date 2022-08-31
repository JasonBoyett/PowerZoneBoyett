import javax.swing.JButton;
import javax.swing.JFrame;

public class BookButton extends JButton {
    JFrame frame;
    Customer bookedCustomer;
    public void book(){
        if(bookedCustomer.validateCustomerID(this.bookedCustomer.getCustomerID()) == true){
            BookedGUI booked = new BookedGUI();
            booked.setVisible(true);
        }

        else if(bookedCustomer.validateCustomerID(this.bookedCustomer.getCustomerID()) == false){
            ErrorGUI error = new ErrorGUI();
            error.setVisible(true);
            this.frame.setVisible(false);
        }
    }
    public BookButton(Customer bookedCustomer,JFrame jFrame) {
        super();
        this.bookedCustomer = bookedCustomer;
        this.frame = jFrame;
        this.addActionListener(e -> book());
    }
}
