package edu.lib.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {
    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @JsonIgnore
    private String userName;

    @JsonIgnore
    private String password;

    //No-arg Constructor

    public Staff(){
        super();
    }

    //All-arg(/Id) Constructor

    public Staff(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PASSWORD_ENCODER.encode(password);
    }

    //Override equals

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Staff))
            return false;
        Staff otherStaff = (Staff) obj;

        return this.id.equals(otherStaff.getId())&&
                this.userName.equals(otherStaff.getUserName())&&
                this.password.equals(otherStaff.getUserName());
    }

}
