package com.example.demo3.model;

import javax.persistence.*;

@Entity
@Table
public class MyNotes {

    @Id
    @GeneratedValue //(strategy = GenerationType.AUTO)
    private long id;

    private String dateNote;
    private String urgencyNote;
    private String textNote;

    public MyNotes(String dateNote, String urgencyNote, String textNote) {
        this.dateNote = dateNote;
        this.urgencyNote = urgencyNote;
        this.textNote = textNote;
    }

    public MyNotes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateNote() {
        return dateNote;
    }

    public void setDateNote(String dateNote) {
        this.dateNote = dateNote;
    }

    public String getUrgencyNote() {
        return urgencyNote;
    }

    public void setUrgencyNote(String urgencyNote) {
        this.urgencyNote = urgencyNote;
    }

    public String getTextNote() {
        return textNote;
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }
}
