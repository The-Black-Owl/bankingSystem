package User;

public class User {
    private String fullName;
    private String nationalID;
    private String contact;
    private String address;

    public User(){}

    public User(String fullname, String nationalID, String contact, String address, Roles userRole) {
        this.fullName = fullname;
        this.nationalID = nationalID;
        this.contact = contact;
        this.address = address;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
