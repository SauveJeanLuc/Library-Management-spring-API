package edu.lib.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @OneToMany
    private List<Book> books;

    //no-arg constructor

    public Publisher() {
        super();
        books = new ArrayList<>();
    }

    //all-args(/Id) constructor

    public Publisher(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addPost(Book book){
        books.add(book);
    }

    //Override equals method


    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Publisher))
            return false;
        Publisher otherPublisher = (Publisher) obj;

        return this.id.equals(otherPublisher.getId())&&
                this.name.equals(otherPublisher.getName())&&
                this.books.equals(otherPublisher.getBooks());
    }

}
