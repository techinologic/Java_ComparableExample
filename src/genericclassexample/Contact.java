package genericclassexample;

/**
 * Created by Paolo T. Inocencion on 09/26/17.
 */
public class Contact {
    String salutation;
    String fName;
    String lName;
    String phoneNumber;

    public Contact(String salutation, String fName, String lName, String phoneNumber) {
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
