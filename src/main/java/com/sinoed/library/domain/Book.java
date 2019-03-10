package com.sinoed.library.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String libraryName;

    private String publisher;

    @ManyToMany
    private Set<Author> authors = new HashSet<>();

    public Book() {
    }

    public Book(String name, String libraryName, String publisher, Set<Author> authors) {
        this.name = name;
        this.libraryName = libraryName;
        this.publisher = publisher;
        this.authors = authors;
    }

    public Book(String name, String libraryName, String publisher) {
        this.name = name;
        this.libraryName = libraryName;
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
