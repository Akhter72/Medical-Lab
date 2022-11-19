package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LiverTestReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double prothrombinTime;
    private double billrubin;
    private double albubin;
    private double totalProtien;
    private String createdAt;
    private String modifiedAt;
    private String isDeleted;

    @OneToOne
    @JoinColumn(name="booking_id", nullable=false)
    private Booking booking;


}
