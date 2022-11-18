package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BoneMarrorTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double blasts;
    private double lymphocytes;
    private double promyelocytes;
    private double plasmaCells;
    private double monocytes;
}
