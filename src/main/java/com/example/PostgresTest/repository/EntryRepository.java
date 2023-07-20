package com.example.PostgresTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PostgresTest.models.Entry;

public interface EntryRepository extends JpaRepository<Entry, String> { 
}
