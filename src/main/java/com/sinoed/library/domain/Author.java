package com.sinoed.library.domain;

import java.util.HashSet;
import java.util.Set;

public class Author {
    private Long id;

    private String name;

    private String lastName;

    private Set<Book> books = new HashSet<>();
}
