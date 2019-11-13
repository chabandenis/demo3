package com.example.demo3.repo;

import com.example.demo3.model.MyNotes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepo extends org.springframework.data.jpa.repository.JpaRepository<MyNotes, Long> {
    @Query("FROM MyNotes WHERE textNote like %:textNote%")
    List<MyNotes> findAllText(@Param("textNote") String textNote);
}
