package com.playground.springhibernate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reviewer {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
}
