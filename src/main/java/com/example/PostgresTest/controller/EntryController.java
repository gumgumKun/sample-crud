package com.example.PostgresTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PostgresTest.models.Entry;
import com.example.PostgresTest.services.EntryService;

@RestController
@RequestMapping("entry")
@CrossOrigin
public class EntryController {

    private EntryService service;

    @Autowired
    public EntryController(EntryService service) {
        this.service = service;
    }

    @GetMapping("getAll")
    public List<Entry> getEntries() {
        return this.service.getEntries();
    }

    @PostMapping("add")
    public void postEntry(@RequestBody Entry entry) {
        System.out.println((entry));
        this.service.postEntry(entry);
    }
}
