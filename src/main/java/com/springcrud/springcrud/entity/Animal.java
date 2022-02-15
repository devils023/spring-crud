package com.springcrud.springcrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @SequenceGenerator(name = "ae_authorisation_letter_seq", sequenceName = "ae_authorisation_letter_seq", allocationSize = 1)
    @GeneratedValue(generator = "ae_authorisation_letter_seq", strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    private String color;
}
