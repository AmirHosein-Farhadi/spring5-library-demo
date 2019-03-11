package com.sinoed.library.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String lastName;

    @ManyToMany
    private Set<Book> books = new HashSet<>();

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Author(String name, String lastName, Set<Book> books) {
        this.name = name;
        this.lastName = lastName;
        this.books = books;
    }

}
