public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    String phoneNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void register(){
        System.out.println("Berhasil membuat akun");
    }

}
