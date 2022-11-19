package com.ideas2it.training.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingId;
    private String createdAt;
    private String modifiedAt;
    private boolean isDeleted;

    @OneToOne(mappedBy = "booking")
    private BloodTestReport bloodTestReport;

    @OneToOne(mappedBy = "booking")
    private UrineTestReport urineTestReport;

    @OneToOne(mappedBy = "booking")
    private StoolTestReport stoolTestReport;

    @OneToOne(mappedBy = "booking")
    private LiverTestReport liverTestReport;

    @OneToOne(mappedBy = "booking")
    private BoneMarrorTestReport boneMarrorTestReport;

    @OneToOne(mappedBy = "booking")
    private CovidTestReport covidTestReport;

    // from booking to app user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name ="staff_id", nullable = true)
    private Staff staff;

    @ManyToMany
    @JoinTable(
            name = "booking_lab_test",
            joinColumns = { @JoinColumn(name = "booking_id") },
            inverseJoinColumns = { @JoinColumn(name = "lab_test_id") }
            )
    private List<LabTest> LabTests;


}
