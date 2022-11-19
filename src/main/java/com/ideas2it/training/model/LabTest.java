package com.ideas2it.training.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class LabTest {
    @Id
    private long labTestId;
    private boolean isActive;
    private boolean isHomeBased;
    private String createdAt;
    private String modifiedAt;
    private boolean isDeleted;
    @ManyToMany
    @JoinTable(
            name = "booking_lab_test",
            joinColumns = { @JoinColumn(name = "lab_test_id") },
            inverseJoinColumns = { @JoinColumn(name = "booking_id") }
    )
    private List<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "lab_id")
    private Lab lab;

    @ManyToOne
    @JoinColumn(name = "test_type_id")
    private TestType testType;
}
