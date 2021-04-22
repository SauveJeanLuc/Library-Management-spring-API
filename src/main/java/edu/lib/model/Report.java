package edu.lib.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Reg_no;

    @OneToOne
    private Reader reader;

    @OneToMany
    private List<Book> books;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date reserveDate;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date dueDate;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date returnDate;



}
