public class Customer {
    private String customerID;
    
    public String getCustomerID() {
        return customerID;
    }

    public boolean validateCustomerID(String customerID) {
        for(int i = 0; i < customerID.length(); i++) {
            if( customerID.charAt(i) >= 'A' || customerID.charAt(i) <= 'Z'){
                i = i;
            } 
            if( customerID.charAt(i) >= 'a' || customerID.charAt(i) <= 'z'){
                i = i;
            } 
            if( customerID.charAt(i) >= '0' || customerID.charAt(i) <= '9'){
                i = i;
            } 
            else{
                return false;
            }
        }
        return true;
    }

    private void formatCustomerID(String customerID){
        this.customerID = this.customerID.toUpperCase();
        this.customerID = this.customerID.charAt(0) + "-" + this.customerID.substring(1, 3) + "-" + this.customerID.charAt(4);
    }
        

    public Customer(String customerID) {
        this.customerID = customerID;
        if(this.validateCustomerID(this.customerID) == false){
            ErrorGUI error = new ErrorGUI();
        }
        else
        this.formatCustomerID(this.customerID);
    }

}
