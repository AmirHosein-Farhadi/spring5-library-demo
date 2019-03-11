package com.sinoed.library.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String libraryName;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private Set<Author> authors = new HashSet<>();
}
