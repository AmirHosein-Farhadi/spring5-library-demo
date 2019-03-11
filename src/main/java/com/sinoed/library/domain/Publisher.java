package com.sinoed.library.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Publisher {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate dateOfEstablishment;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();
}
