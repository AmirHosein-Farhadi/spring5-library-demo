package com.sinoed.library.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Publisher {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate dateOfEstablishment;


    private Set<Book> books = new HashSet<>();

}
