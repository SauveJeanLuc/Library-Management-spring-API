package edu.lib.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Float price;

    @NotNull
    private String Category;

    @NotNull
    private String Edition;

    @NotNull
    private String title;

    @NotNull
    private String ISBN;

    @NotNull
    private String AuthNo;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Publisher publisher;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date yearOfPublication;
}
