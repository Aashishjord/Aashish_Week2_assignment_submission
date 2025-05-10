class Contact {
    String name;
    String phoneNumber;
    String emailAddress;

    Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    void displayContact() {
        if (!emailAddress.isEmpty()) {
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + emailAddress);
            System.out.println("-------------------------");
        }
    }
}
public class Qn8_medium {
    public static void main(String[] args) {
        Contact c1 = new Contact("Aashish", "9800000001", "aashish@gmail.com");
        Contact c2 = new Contact("Sita", "9800000002", "");
        Contact c3 = new Contact("Ram", "9800000003", "ram@domain.com"); 
        c1.displayContact();
        c2.displayContact();
        c3.displayContact();
    }
}
