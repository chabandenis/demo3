package com.example.demo3.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class MyNotes {

    @Id
    @GeneratedValue //(strategy = GenerationType.AUTO)
    private long id;

    private LocalDateTime dateNote;
    private String urgencyNote;
    private String textNote;

    public MyNotes(LocalDateTime dateNote, String urgencyNote, String textNote) {
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

    public LocalDateTime getDateNote() {
        return dateNote;
    }

    public void setDateNote(LocalDateTime dateNote) {
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
