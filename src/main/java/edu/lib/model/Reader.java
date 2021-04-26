package edu.lib.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String email;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String phoneNum;

    @NotNull
    private String address;


    //no-arg constructor
    public Reader() {
        super();
    }
    //all-arg(/id) constructor

    public Reader(String email, String firstName, String lastName, String phoneNum, String address) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    //getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //override equals methods

    @Override
    public boolean equals(Object obj){
        Reader otherReader = (Reader) obj;

        if(!this.email.equals(otherReader.getEmail()))
            System.out.println("Emails are not the same");
        if(!this.firstName.equals(otherReader.getFirstName()))
            System.out.println("FirstNames are not the same");
        if(!this.lastName.equals(otherReader.getLastName()))
            System.out.println("LastNames are not the same");
        if(!this.phoneNum.equals(otherReader.getPhoneNum()))
            System.out.println("PhoneNums are not the same");
        if(!this.address.equals(otherReader.getAddress()))
            System.out.println("Addresses are not the same");
        return false;

    }

}
