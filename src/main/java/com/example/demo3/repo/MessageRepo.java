package com.example.demo3.repo;

import com.example.demo3.model.MyNotes;

import java.util.UUID;

public interface MessageRepo extends org.springframework.data.jpa.repository.JpaRepository<MyNotes, Long> {
}
