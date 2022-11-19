package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UrineTestReport {
    @Id
    private long id;
    private double rbcCount;
    private double wbcCount;
    private double phLevel;
    private boolean nitriteNegative;
    private boolean leukocyteEsteraseNegative;
    private String createdAt;
    private String modifiedAt;
    private String isDeleted;

    @OneToOne
    @JoinColumn(name="booking_id", nullable=false)
    private Booking booking;
}
