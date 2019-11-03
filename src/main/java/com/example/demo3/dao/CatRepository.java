package com.example.demo3.dao;

import com.example.demo3.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface CatRepository extends JpaRepository<Cat, UUID> {
}
