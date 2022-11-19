package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CovidTestReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String specimenType;
    private String testPrinciples;
    private boolean testPositive;
    private String createdAt;
    private String modifiedAt;
    private String isDeleted;

    @OneToOne
    @JoinColumn(name="booking_id", nullable=false)
    private Booking booking;

}
