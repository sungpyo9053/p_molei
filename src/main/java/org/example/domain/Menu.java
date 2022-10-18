package org.example.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Menu {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long shop_id;
    private String name;
    private String price;
    private String description;
    private String start_time;
    private String end_time;
}
