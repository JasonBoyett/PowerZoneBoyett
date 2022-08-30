public class Customer {
    private String customerID;
    
    public String getCustomerID() {
        return customerID;
    }

    public void formatCustomer(String customerID) {
        for(int i = 0; i < customerID.length(); i++) {
            if( customerID.charAt(i) >= 'A' || customerID.charAt(i) <= 'Z'){
                
            } 
            if( customerID.charAt(i) >= 'a' || customerID.charAt(i) <= 'z'){
                
            } 
            if( customerID.charAt(i) >= '0' || customerID.charAt(i) <= '9'){
            
            } 
            else{
                ErrorGUI error = new ErrorGUI();
            }
        }
        this.customerID = this.customerID.toUpperCase();
        this.customerID = this.customerID.charAt(0) + "-" + this.customerID.substring(1, 3) + "-" + this.customerID.charAt(4);
    }
        

    public Customer(String customerID) {
        this.customerID = customerID;
        this.formatCustomer(customerID);
    }

}
