package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UrineTestResult {
    @Id
    private long id;
    private double rbcCount;
    private double wbcCount;
    private double phLevel;
    private boolean nitriteNegative;
    private boolean leukocyteEsteraseNegative;
//    @OneToOne(mappedBy = "urineTestResult")
//    private Booking booking;
}
