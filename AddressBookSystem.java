package AddressBookSystem;

import java.util.Scanner;

public class AddressBookSystem {

    String FirstName,LastName,Gmail,Address,City,State;
    int zipCode;
    long PhnNumber;
    void person(String FirstName,String LastName,String Gmail,String Address,String City,String State,int zipCode,long PhnNumber)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gmail = Gmail;
        this.Address = Address;
        this.City = City;
        this.State = State;
        this.zipCode = zipCode;
        this.PhnNumber = PhnNumber;
              }
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

    public long getPhnNumber() {
        return PhnNumber;
    }

    public void setPhnNumber(long phnNumber) {
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
            Address.person("Sai","Tarun","Sai@gmail.com","HWK","Vizag","AP",530048,9381217387l);
            Address.Contact();
        }
    }
