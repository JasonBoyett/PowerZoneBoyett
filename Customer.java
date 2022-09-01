public class Customer {
    private String customerID;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public boolean validateCustomerID(String customerID) {
        for (int i = 0; i < this.customerID.length(); i++) {
            if (customerID.charAt(i) >= 'A' || customerID.charAt(i) <= 'Z') {

            }
            if (customerID.charAt(i) >= 'a' || customerID.charAt(i) <= 'z') {

            }
            if (customerID.charAt(i) >= '0' || customerID.charAt(i) <= '9') {

            } else {
                return false;
            }
        }
        return true;
    }

    private void formatCustomerID() {
        this.customerID = this.customerID.toUpperCase();
        this.customerID = this.customerID.charAt(0) + "-" + this.customerID.substring(1, 3) + "-"
                + this.customerID.charAt(4);
    }

    public Customer(String CustomerID) {
        this.customerID = CustomerID;
        if (this.validateCustomerID(this.customerID) == false) {
            ErrorGUI error = new ErrorGUI();
            error.setVisible(true);
        } else
            this.formatCustomerID();
    }

}
