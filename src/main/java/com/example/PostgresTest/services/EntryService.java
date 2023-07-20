package com.example.PostgresTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PostgresTest.models.Entry;
import com.example.PostgresTest.repository.EntryRepository;

@Service
public class EntryService {
    EntryRepository repository;

    @Autowired
    public EntryService(EntryRepository repository) {
        this.repository = repository;
    } 

    public List<Entry> getEntries() {
        return repository.findAll();
    }

    public void postEntry(Entry entry) {
        repository.save(entry);
    }
}
