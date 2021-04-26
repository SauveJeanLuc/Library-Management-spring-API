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


    //no-arg constructor

    public Report(){
        super();
    }

    //all-arg(/Id) constructor

    public Report(Reader reader, List<Book> books, Date reserveDate, Date dueDate, Date returnDate) {
        this.reader = reader;
        this.books = books;
        this.reserveDate = reserveDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

    //getters and setters

    public Long getReg_no() {
        return Reg_no;
    }

    public void setReg_no(Long reg_no) {
        Reg_no = reg_no;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Date getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }


    //override equals method

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Report))
            return false;
        Report otherReport = (Report) obj;
        return this.Reg_no.equals(otherReport.getReg_no())&&
                this.reader.equals(otherReport.getReader())&&
                this.books.equals(otherReport.getBooks())&&
                this.reserveDate.equals(otherReport.getReserveDate())&&
                this.dueDate.equals(otherReport.getDueDate())&&
                this.returnDate.equals(otherReport.getReturnDate());
    }

}
