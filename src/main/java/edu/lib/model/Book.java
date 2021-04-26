package edu.lib.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ISBN;

    @NotNull
    private Float price;

    @NotNull
    private String category;

    @NotNull
    private String edition;

    @NotNull
    private String title;

    @NotNull
    private String authNo;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Publisher publisher;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date yearOfPublication;

    //no-arg constructor

    public Book(){
        super();
    }

    //All-args(except Id) constructor

    public Book(Float price, String category, String edition, String title, String authNo, Publisher publisher, Date yearOfPublication) {
        this.price = price;
        this.category = category;
        this.edition = edition;
        this.title = title;
        this.authNo = authNo;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }


    //Getters and Setters

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Date getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Date yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


    //Override equals method

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Book))
            return false;
        Book otherBook = (Book) obj;
        return this.ISBN.equals(otherBook.getISBN()) &&
                this.title.equals(otherBook.getTitle()) &&
                this.publisher.equals(otherBook.getPublisher());
    }
}
