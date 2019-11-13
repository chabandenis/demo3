package com.example.demo3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table
public class Notes {

    //   @ GeneratedValue
    @Id
    UUID id;

    private String dateNote;
    private String urgencyNote;
    private String textNote;

    public Notes(String dateNote, String urgencyNote, String textNote) {
        this.dateNote = dateNote;
        this.urgencyNote = urgencyNote;
        this.textNote = textNote;
    }

    public Notes() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
