package org.example.domain;

import org.springframework.data.annotation.Id;

public class Address {

    @Id
    private Long id;
    private String city;
    private String district;
    private String town;
    private String detail;
}
