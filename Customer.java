public class Customer {
    private String customerID;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public boolean validateCustomerID(String customerID) {
        if (this.customerID.equals("#####")) {
            return true;
        }
        for (int i = 0; i < 7; i++) {
            if (customerID.charAt(i) >= 'A' || customerID.charAt(i) <= 'Z') {

            }
            if (customerID.charAt(i) >= 'a' || customerID.charAt(i) <= 'z') {

            }
            if (customerID.charAt(i) >= '0' || customerID.charAt(i) <= '9') {

            }
            if (customerID.charAt(i) == '-' && i == 1) {

            }
            if (customerID.charAt(i) == '-' && i == 4) {

            }
            if (customerID.charAt(i) == ' ') {
                return false;
            }
        }
        System.out.println("was valid");
        return true;
    }

    private void formatCustomerID() {
        try {
            this.customerID = this.customerID.toUpperCase();
            this.customerID = this.customerID.charAt(0) + "-" + this.customerID.substring(1, 4) + "-"
                    + this.customerID.charAt(4);
        } catch (Exception e) {
            ErrorGUI error = new ErrorGUI();
            error.setVisible(true);
        }
    }

    public Customer(String CustomerID) {
        this.customerID = CustomerID;
        this.formatCustomerID();
        System.out.println("formatted");
    }

}
