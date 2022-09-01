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
            if (this.customerID.charAt(i) >= 'A' || this.customerID.charAt(i) <= 'Z') {

            }
            if (this.customerID.charAt(i) >= 'a' || this.customerID.charAt(i) <= 'z') {

            }
            if (this.customerID.charAt(i) >= '0' || this.customerID.charAt(i) <= '9') {

            } else {
                return false;
            }
        }
        return true;
    }

    private void formatCustomerID(String customerID) {
        this.customerID = this.customerID.toUpperCase();
        this.customerID = this.customerID.charAt(0) + "-" + this.customerID.substring(1, 3) + "-"
                + this.customerID.charAt(4);
    }

    public Customer(String customerID) {
        this.customerID = customerID;
        if (this.validateCustomerID(this.customerID) == false) {
            ErrorGUI error = new ErrorGUI();
            error.setVisible(true);
        } else
            this.formatCustomerID(this.customerID);
    }

}
