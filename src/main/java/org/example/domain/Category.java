package org.example.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
}
