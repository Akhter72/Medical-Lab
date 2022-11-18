package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LiverTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double prothrombinTime;
    private double billrubin;
    private double albubin;
    private double totalProtien;


}
