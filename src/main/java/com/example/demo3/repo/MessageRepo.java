package com.example.demo3.repo;

import com.example.demo3.dao.NotesRepository;
import com.example.demo3.model.Notes;

import java.util.UUID;

public interface MessageRepo extends NotesRepository<Notes, UUID> {
}
