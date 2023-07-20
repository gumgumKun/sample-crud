package com.example.PostgresTest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String value;
}
