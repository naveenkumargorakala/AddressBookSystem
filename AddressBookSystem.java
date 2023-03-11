package AddressBookSystem;

import java.util.Scanner;

public class AddressBookSystem {

    String FirstName,LastName,Gmail,Address,City,State;
    int zipCode;
    double PhnNumber;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        Gmail = Gmail;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public double getPhnNumber() {
        return PhnNumber;
    }

    public void setPhnNumber(double phnNumber) {
        PhnNumber = phnNumber;
    }
    void Contact(){
        System.out.println("First: "+FirstName);
        System.out.println("LastName: "+LastName);
        System.out.println("Gmail id: "+Gmail);
        System.out.println("Address: "+Address);
        System.out.println("City: "+City);
        System.out.println("State: "+State);
        System.out.println("ZipCode: "+zipCode);
        System.out.println("PhoneNumber:"+PhnNumber);

    }

        public static void main(String[] args){
            System.out.println("Welcome to Address Book Program");
            AddressBookSystem Address = new AddressBookSystem();
            Scanner input = new Scanner(System.in);
            System.out.println("FirstName: ");
            Address.FirstName=input.nextLine();
            System.out.println("LastName: ");
            Address.LastName=input.nextLine();
            System.out.println("Gmail id: ");
            Address.Gmail = input.nextLine();
            System.out.println("Address: ");
            Address.Address= input.nextLine();
            System.out.println("City: ");
            Address.City=input.nextLine();
            System.out.println("State: ");
            Address.State=input.nextLine();
            System.out.println("ZipCode: ");
            Address.zipCode=input.nextInt();
            System.out.println("Phone: ");
            Address.PhnNumber=input.nextDouble();
            Address.Contact();
        }
    }
