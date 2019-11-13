package com.example.demo3.repo;

import com.example.demo3.model.Notes;

import java.util.UUID;

public interface MessageRepo extends org.springframework.data.jpa.repository.JpaRepository<Notes, UUID> {
}
