package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StoolTestReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean starchNegative;
    private boolean yeastNegative;
    private boolean protozoaNegative;
    private boolean macrophagesNegative;
    private boolean fatBodiesNegative;
    private String createdAt;
    private String modifiedAt;
    private String isDeleted;

    @OneToOne
    @JoinColumn(name="booking_id", nullable=false)
    private Booking booking;



}
