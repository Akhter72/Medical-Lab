package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BoneMarrorTestReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double blasts;
    private double lymphocytes;
    private double promyelocytes;
    private double plasmaCells;
    private double monocytes;
    private String createdAt;
    private String modifiedAt;
    private String isDeleted;
    @OneToOne
    @JoinColumn(name="booking_id", nullable=false)
    private Booking booking;
}
